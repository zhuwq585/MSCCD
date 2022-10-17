grammar zig;

// root
//     : container_doc_comment? ContainerMembers EOF;

// Top Level

root
    : Container_doc_comment? containerMembers
    ;

containerMembers
    : containerDeclarations (containerField COMMA)* (containerField | containerDeclarations)
    ;


containerDeclarations
    : testDecl containerDeclarations
    | topLevelComptime containerDeclarations
    | Doc_comment? KEYWORD_PUB? topLevelDecl containerDeclarations
    ;

testDecl
    : Doc_comment? KEYWORD_TEST STRINGLITERALSINGLE? block
    ;

topLevelComptime
    : Doc_comment? KEYWORD_COMPTIME block
    ;

topLevelDecl
    : (KEYWORD_EXPORT | KEYWORD_EXTERN STRINGLITERALSINGLE? | (KEYWORD_INLINE | KEYWORD_NOINLINE))? fnProto (SEMICOLON | block)
    | (KEYWORD_EXPORT| KEYWORD_EXTERN STRINGLITERALSINGLE?)? KEYWORD_THREADLOCAL? varDecl
    | KEYWORD_USINGNAMESPACE expr SEMICOLON
    ; 

fnProto
    : KEYWORD_FN IDENTIFIER? LPAREN paramDeclList RPAREN byteAlign? linkSection? callConv? EXCLAMATIONMARK? typeExpr
    ;

varDecl 
    : (KEYWORD_CONST| KEYWORD_VAR) IDENTIFIER (COLON typeExpr)? byteAlign? linkSection? (EQUAL expr)? SEMICOLON
    ;

containerField
    : Doc_comment? KEYWORD_COMPTIME? IDENTIFIER (COLON typeExpr byteAlign?)? (EQUAL expr)?
    ;


// block Level

statement
    : KEYWORD_COMPTIME? varDecl
    | KEYWORD_COMPTIME blockExprStatement
    | KEYWORD_NOSUSPEND blockExprStatement
    | KEYWORD_SUSPEND blockExprStatement
    | KEYWORD_DEFER blockExprStatement
    | KEYWORD_ERRDEFER payload? blockExprStatement
    | ifStatement
    | labeledStatement
    | switchExpr
    | assignExpr SEMICOLON
    ;

ifStatement
    : ifPrefix blockExpr ( KEYWORD_ELSE payload? statement )?
    | ifPrefix assignExpr ( SEMICOLON| KEYWORD_ELSE payload? statement )
    ;

labeledStatement
    : blockLabel? (block| loopStatement)
    ;

loopStatement 
    : KEYWORD_INLINE? (forStatement| whileStatement)
    ;

forStatement
    : forPrefix blockExpr ( KEYWORD_ELSE statement )?
    | forPrefix assignExpr ( SEMICOLON| KEYWORD_ELSE statement )
    ;

whileStatement
    : whilePrefix blockExpr ( KEYWORD_ELSE payload? statement )?
    | whilePrefix assignExpr ( SEMICOLON| KEYWORD_ELSE payload? statement )
    ;

blockExprStatement
    : blockExpr
    | assignExpr SEMICOLON
    ;

blockExpr 
    : blockLabel? block
    ;

// Expression Level

assignExpr 
    : expr (assignOp expr)?
    ;

expr 
    : boolOrExpr
    ;

boolOrExpr 
    : boolAndExpr (KEYWORD_OR boolAndExpr)*
    ;

boolAndExpr 
    : compareExpr (KEYWORD_AND compareExpr)*
    ;

compareExpr 
    : bitwiseExpr (compareOp bitwiseExpr)?
    ;

bitwiseExpr 
    : bitShiftExpr (bitwiseOp bitShiftExpr)*
    ;

bitShiftExpr 
    : additionExpr (bitShiftOp additionExpr)*
    ;

additionExpr 
    : multiplyExpr (additionOp multiplyExpr)*
    ;

multiplyExpr 
    : prefixExpr (multiplyOp prefixExpr)*
    ;

prefixExpr 
    : prefixOp* primaryExpr
    ;

primaryExpr
    : asmExpr
    | ifExpr
    | KEYWORD_BREAK breakLabel? expr?
    | KEYWORD_COMPTIME expr
    | KEYWORD_NOSUSPEND expr
    | KEYWORD_CONTINUE breakLabel?
    | KEYWORD_RESUME expr
    | KEYWORD_RETERN expr?
    | blockLabel? loopExpr
    | block
    | curlysuffixExpr
    ;

ifExpr 
    : ifPrefix expr (KEYWORD_ELSE payload? expr)?
    ;

block 
    : LBRACE statement* RBRACE
    ;

loopExpr 
    : KEYWORD_INLINE? (forExpr| whileExpr)
    ;

forExpr 
    : forPrefix expr (KEYWORD_ELSE expr)?
    ;

whileExpr 
    : whilePrefix expr (KEYWORD_ELSE payload? expr)?
    ;

curlysuffixExpr 
    : typeExpr initList?
    ;

initList
    : LBRACE fieldInit (COMMA fieldInit)* COMMA? RBRACE
    | LBRACE expr (COMMA expr)* COMMA? RBRACE
    | LBRACE RBRACE
    ;

typeExpr 
    : prefixTypeOp* errorUnionExpr
    ;

errorUnionExpr 
    : suffixExpr (EXCLAMATIONMARK typeExpr)?
    ;

suffixExpr
    : KEYWORD_ASYNC primaryTypeExpr suffixOp* fnCallArguments
    | primaryTypeExpr (suffixOp| fnCallArguments)*
    ;

primaryTypeExpr
    : BUILTINIDENTIFIER fnCallArguments
    | CHAR_LITERAL
    | containerDecl
    | DOT IDENTIFIER
    | DOT initList
    | errorSetDecl
    | FLOAT
    | fnProto
    | groupedExpr
    | labeledTypeExpr
    | IDENTIFIER
    | ifTypeExpr
    | INTEGER
    | KEYWORD_COMPTIME typeExpr
    | KEYWORD_ERROR DOT IDENTIFIER
    | KEYWORD_ANYFRAME
    | KEYWORD_UNREACHABLE
    | STRINGLITERAL
    | switchExpr
    ;

containerDecl 
    : (KEYWORD_EXTERN| KEYWORD_PACKED)? containerDeclAuto
    ;

errorSetDecl 
    : KEYWORD_ERROR LBRACE identifierList RBRACE
    ;

groupedExpr 
    : LPAREN expr RPAREN
    ;

ifTypeExpr 
    : ifPrefix typeExpr (KEYWORD_ELSE payload? typeExpr)?
    ;

labeledTypeExpr
    : blockLabel block
    | blockLabel? loopTypeExpr
    ;

loopTypeExpr 
    : KEYWORD_INLINE? (forTypeExpr| whileTypeExpr)
    ;

forTypeExpr 
    : forPrefix typeExpr (KEYWORD_ELSE typeExpr)?
    ;

whileTypeExpr 
    : whilePrefix typeExpr (KEYWORD_ELSE payload? typeExpr)?
    ;

switchExpr 
    : KEYWORD_SWITCH LPAREN expr RPAREN LBRACE switchProngList RBRACE
    ;

// Assembly

asmExpr 
    : KEYWORD_ASM KEYWORD_VOLATILE? LPAREN expr asmOutput? RPAREN
    ;

asmOutput 
    : COLON asmOutputList asmInput?
    ;

asmOutputItem 
    : LBRACKET IDENTIFIER RBRACKET STRINGLITERAL LPAREN (MINUSRARROW typeExpr| IDENTIFIER) RPAREN
    ;

asmInput 
    : COLON asmInputList asmClobbers?
    ;

asmInputItem 
    : LBRACKET IDENTIFIER RBRACKET STRINGLITERAL LPAREN expr RPAREN
    ;

asmClobbers 
    : COLON stringList
    ;

// # *** Helper grammar ***
breakLabel 
    : COLON IDENTIFIER
    ;

blockLabel 
    : IDENTIFIER COLON
    ;

fieldInit 
    : DOT IDENTIFIER EQUAL expr
    ;

whileContinueExpr 
    : COLON LPAREN assignExpr RPAREN
    ;

linkSection 
    : KEYWORD_LINKSECTION LPAREN expr RPAREN
    ;

// # Fn specific
callConv 
    : KEYWORD_CALLCONV LPAREN expr RPAREN
    ;

paramDecl
    : Doc_comment? (KEYWORD_NOALIAS| KEYWORD_COMPTIME)? (IDENTIFIER COLON)? paramType
    | DOT3
    ;

paramType
    : KEYWORD_ANYTYPE
    | typeExpr
    ;

// # Control flow prefixes
ifPrefix 
    : KEYWORD_IF LPAREN expr RPAREN ptrpayload?
    ;

whilePrefix 
    : KEYWORD_WHILE LPAREN expr RPAREN ptrpayload? whileContinueExpr?
    ;

forPrefix 
    : KEYWORD_FOR LPAREN expr RPAREN ptrIndexpayload
    ;

// payloads
payload 
    : PIPE IDENTIFIER PIPE
    ;

ptrpayload 
    : PIPE ASTERISK? IDENTIFIER PIPE
    ;

ptrIndexpayload 
    : PIPE ASTERISK? IDENTIFIER (COMMA IDENTIFIER)? PIPE
    ;

//Switch specific
switchProng 
    : switchCase EQUALRARROW ptrpayload? assignExpr
    ;

switchCase
    : switchItem (COMMA switchItem)* COMMA?
    | KEYWORD_ELSE
    ;

switchItem 
    : expr (DOT3 expr)?
    ;

// Operators

assignOp    
    : ASTERISKEQUAL
    | SLASHEQUAL
    | PERCENTEQUAL
    | PLUSEQUAL
    | MINUSEQUAL
    | LARROW2EQUAL
    | RARROW2EQUAL
    | AMPERSANDEQUAL
    | CARETEQUAL
    | PIPEEQUAL
    | ASTERISKPERCENTEQUAL
    | PLUSPERCENTEQUAL
    | MINUSPERCENTEQUAL
    | EQUAL
    ;

compareOp
    : EQUALEQUAL
    | EXCLAMATIONMARKEQUAL
    | LARROW
    | RARROW
    | LARROWEQUAL
    | RARROWEQUAL
    ;

bitwiseOp
    : AMPERSAND
    | CARET
    | PIPE
    | KEYWORD_ORELSE
    | KEYWORD_CATCH payload?
    ;

bitShiftOp
    : LARROW2
    | RARROW2
    ;

additionOp
    : PLUS
    | MINUS
    | PLUS2
    | PLUSPERCENT
    | MINUSPERCENT
    ;

multiplyOp
    : PIPE2
    | ASTERISK
    | SLASH
    | PERCENT
    | ASTERISK2
    | ASTERISKPERCENT
    ;

prefixOp
    : EXCLAMATIONMARK
    | MINUS
    | TILDE
    | MINUSPERCENT
    | AMPERSAND
    | KEYWORD_TRY
    | KEYWORD_AWAIT
    ;

prefixTypeOp
    : QUESTIONMARK
    | KEYWORD_ANYFRAME MINUSRARROW
    | sliceTypeStart (byteAlign| KEYWORD_CONST| KEYWORD_VOLATILE| KEYWORD_ALLOWZERO)*
    | ptrTypeStart (KEYWORD_ALIGN LPAREN expr (COLON INTEGER COLON INTEGER)? RPAREN| KEYWORD_CONST| KEYWORD_VOLATILE| KEYWORD_ALLOWZERO)*
    | arrayTypeStart
    ;

suffixOp
    : LBRACKET expr (DOT2 (expr? (COLON expr)?)?)? RBRACKET
    | DOT IDENTIFIER
    | DOTASTERISK
    | DOTQUESTIONMARK
    ;

fnCallArguments 
    : LPAREN exprList RPAREN
    ;

// # Ptr specific
sliceTypeStart 
    : LBRACKET (COLON expr)? RBRACKET
    ;

ptrTypeStart
    : ASTERISK
    | ASTERISK2
    | LBRACKET ASTERISK (LETTERC| COLON expr)? RBRACKET
    ;

arrayTypeStart 
    : LBRACKET expr (COLON expr)? RBRACKET
    ;

// containerDecl specific
containerDeclAuto 
    : containerDeclType LBRACE Container_doc_comment? containerMembers RBRACE
    ;

containerDeclType
    : KEYWORD_STRUCT
    | KEYWORD_OPAQUE
    | KEYWORD_ENUM (LPAREN expr RPAREN)?
    | KEYWORD_UNION (LPAREN (KEYWORD_ENUM (LPAREN expr RPAREN)?| expr) RPAREN)?
    ;

// Alignment
byteAlign 
    : KEYWORD_ALIGN LPAREN expr RPAREN
    ;

// # Lists
identifierList 
    : (Doc_comment? IDENTIFIER COMMA)* (Doc_comment? IDENTIFIER)?
    ;

switchProngList 
    : (switchProng COMMA)* switchProng?
    ;

asmOutputList 
    : (asmOutputItem COMMA)* asmOutputItem?
    ;

asmInputList 
    : (asmInputItem COMMA)* asmInputItem?
    ;

stringList 
    : (STRINGLITERAL COMMA)* STRINGLITERAL?
    ;

paramDeclList 
    : (paramDecl COMMA)* paramDecl?
    ;

exprList 
    : (expr COMMA)* expr?
    ;






// *** Tokens ***

KEYWORD_ALIGN       
    : 'align'       
    ;

KEYWORD_ALLOWZERO   
    : 'allowzero'   
    ;

KEYWORD_AND         
    : 'and'         
    ;

KEYWORD_ANYFRAME    
    : 'anyframe'    
    ;

KEYWORD_ANYTYPE     
    : 'anytype'     
    ;

KEYWORD_ASM         
    : 'asm'         
    ;

KEYWORD_ASYNC       
    : 'async'       
    ;

KEYWORD_AWAIT       
    : 'await'       
    ;

KEYWORD_BREAK       
    : 'break'       
    ;

KEYWORD_CALLCONV    
    : 'callconv'    
    ;

KEYWORD_CATCH       
    : 'catch'       
    ;

KEYWORD_COMPTIME    
    : 'comptime'    
    ;

KEYWORD_CONST       
    : 'const'       
    ;

KEYWORD_CONTINUE    
    : 'continue'    
    ;

KEYWORD_DEFER       
    : 'defer'       
    ;

KEYWORD_ELSE        
    : 'else'        
    ;

KEYWORD_ENUM        
    : 'enum'        
    ;

KEYWORD_ERRDEFER    
    : 'errdefer'    
    ;

KEYWORD_ERROR       
    : 'error'       
    ;

KEYWORD_EXPORT      
    : 'export'      
    ;

KEYWORD_EXTERN      
    : 'extern'      
    ;

KEYWORD_FN          
    : 'fn'          
    ;

KEYWORD_FOR         
    : 'for'         
    ;

KEYWORD_IF          
    : 'if'          
    ;

KEYWORD_INLINE      
    : 'inline'      
    ;

KEYWORD_NOALIAS     
    : 'noalias'     
    ;

KEYWORD_NOSUSPEND   
    : 'nosuspend'   
    ;

KEYWORD_NOINLINE    
    : 'noinline'    
    ;

KEYWORD_OPAQUE      
    : 'opaque'      
    ;

KEYWORD_OR          
    : 'or'          
    ;

KEYWORD_ORELSE      
    : 'orelse'      
    ;

KEYWORD_PACKED      
    : 'packed'      
    ;

KEYWORD_PUB         
    : 'pub'         
    ;

KEYWORD_RESUME      
    : 'resume'      
    ;

KEYWORD_RETERN      
    : 'return'      
    ;

KEYWORD_LINKSECTION 
    : 'linksection' 
    ;

KEYWORD_STRUCT      
    : 'struct'      
    ;

KEYWORD_SUSPEND     
    : 'suspend'     
    ;

KEYWORD_SWITCH      
    : 'switch'      
    ;

KEYWORD_TEST        
    : 'test'        
    ;

KEYWORD_THREADLOCAL 
    : 'threadlocal' 
    ;

KEYWORD_TRY         
    : 'try'         
    ;

KEYWORD_UNION       
    : 'union'       
    ;

KEYWORD_UNREACHABLE 
    : 'unreachable' 
    ;

KEYWORD_USINGNAMESPACE 
    : 'usingnamespace' 
    ;

KEYWORD_VAR         
    : 'var'         
    ;

KEYWORD_VOLATILE    
    : 'volatile'    
    ;

KEYWORD_WHILE       
    : 'while'       
    ;


fragment
Bin 
    : [01]
    ;

fragment
Bin_ 
    : '_'? Bin
    ;

fragment
Oct 
    : [0-7]
    ;

fragment
Oct_ 
    : '_'? Oct
    ;

fragment
Hex 
    : [0-9a-fA-F]
    ;

fragment
Hex_ 
    : '_'? Hex
    ;

fragment
Dec 
    : [0-9]
    ;

fragment
Dec_ 
    : '_'? Dec
    ;

fragment
Bin_int 
    : Bin Bin_*
    ;

fragment
Oct_int 
    : Oct Oct_*
    ;

fragment
Dec_int 
    : Dec Dec_*
    ;

fragment
Hex_int 
    : Hex Hex_*
    ;
    
fragment
Ox80_oxBF 
    : '\u0800'..'\u1115'
    ;


fragment
OxF4 
    : '\u1504'
    ;

fragment
Ox80_ox8F 
    : '\u0800'..'\u0815'
    ;

fragment
OxF1_oxF3 
    : '\u1501'..'\u1503'
    ;

fragment
OxF0 
    : '\u1500'
    ;

fragment
Ox90_0xBF 
    : '\u0900'..'\u1115'
    ;

fragment
OxEE_oxEF 
    : '\u1414'..'\u1415'
    ;


fragment
OxED 
    : '\u1413'
    ;

fragment
Ox80_ox9F 
    : '\u0800'..'\u0915'
    ;

fragment
OxE1_oxEC 
    : '\u1401'..'\u1412'
    ;

fragment
OxE0
    : '\u1400'
    ;

fragment
OxA0_oxBF 
    : '\u1000'..'\u1115'
    ;

fragment
OxC2_oxDF 
    : '\u1202'..'\u1315'
    ;
    
//# From https://lemire.me/blog/2018/05/09/how-quickly-can-you-check-that-a-string-is-valid-unicode-utf-8/
//# First Byte      Second Byte     Third Byte      Fourth Byte
//# [0x00,0x7F]
//# [0xC2,0xDF]     [0x80,0xBF]
//#    0xE0         [0xA0,0xBF]     [0x80,0xBF]
//# [0xE1,0xEC]     [0x80,0xBF]     [0x80,0xBF]
// #    0xED         [0x80,0x9F]     [0x80,0xBF]
// # [0xEE,0xEF]     [0x80,0xBF]     [0x80,0xBF]
// #    0xF0         [0x90,0xBF]     [0x80,0xBF]     [0x80,0xBF]
// # [0xF1,0xF3]     [0x80,0xBF]     [0x80,0xBF]     [0x80,0xBF]
// #    0xF4         [0x80,0x8F]     [0x80,0xBF]     [0x80,0xBF]

fragment
Mb_utf8_literal 
    : OxF4      Ox80_ox8F Ox80_oxBF Ox80_oxBF
    | OxF1_oxF3 Ox80_oxBF Ox80_oxBF Ox80_oxBF
    | OxF0      Ox90_0xBF Ox80_oxBF Ox80_oxBF
    | OxEE_oxEF Ox80_oxBF Ox80_oxBF
    | OxED      Ox80_ox9F Ox80_oxBF
    | OxE1_oxEC Ox80_oxBF Ox80_oxBF
    | OxE0      OxA0_oxBF Ox80_oxBF
    | OxC2_oxDF Ox80_oxBF
    ;

// fragment
// Ascii_char_not_nl_slash_squote 
//     : '\u0000'..'\u0009'
//     | '\u0011'..'\u0026'
//     | '\u0028'
//     : [\000-\011\013-\046-\050-\133\135-\177]
//     ;

fragment
Char_escape
    : '\\x' Hex Hex
    | '\\u{' Hex+ '}'
    | '\\' [nr\\t'"]
    ;

fragment
Char_char
    : Mb_utf8_literal
    | Char_escape
    // | Ascii_char_not_nl_slash_squote
    ;

fragment
String_char
    : Char_escape
    | ~[\\"\n]
    ;

Container_doc_comment 
    : ('//!' ~[\n]* [ \n]*)+
    ;

Doc_comment 
    : ('///' ~[\n]* [ \n]*)+
    ;

Line_comment 
    : '//' ~[\n]* | '////' ~[\n]*
    ;

fragment
Line_string 
    : ('\\\\' ~[\n]* [ \n]*)+
    ;

// fragment
// Skip 
//     : ([ \n]| Line_comment)* 
//     -> skip
//     ;

CHAR_LITERAL 
    : '\'' Char_char '\'' 
    ;

FLOAT
    : '0x' Hex_int '.' Hex_int ([pP] [-+]? Dec_int)? 
    |      Dec_int '.' Dec_int ([eE] [-+]? Dec_int)? 
    | '0x' Hex_int [pP] [-+]? Dec_int 
    |      Dec_int [eE] [-+]? Dec_int 
    ;

INTEGER
    : '0b' Bin_int 
    | '0o' Oct_int 
    | '0x' Hex_int 
    |      Dec_int 
    ;

STRINGLITERALSINGLE 
    : '"' String_char* '"' 
    ;

STRINGLITERAL
    : STRINGLITERALSINGLE
    | (Line_string                 )+
    ;

IDENTIFIER
    : [A-Za-z_] [A-Za-z0-9_]*  
    | '@"' String_char* '"'    
    ;

BUILTINIDENTIFIER 
    : '@'[A-Za-z_][A-Za-z0-9_]* 
    ;

AMPERSAND            
    : '&'  ~[&]         
    ;

AMPERSANDEQUAL       
    : '&='              
    ;

ASTERISK             
    : '*'   ~[*%=]     
    ;

ASTERISK2            
    : '**'               
    ;

ASTERISKEQUAL        
    : '*='               
    ;

ASTERISKPERCENT      
    : '*%'  ~[=]        
    ;

ASTERISKPERCENTEQUAL 
    : '*%='              
    ;

CARET                
    : '^'  ~[=]      
    ;

CARETEQUAL           
    : '^='               
    ;

COLON                
    : ':'                
    ;

COMMA                
    : ','                
    ;

DOT                  
    : '.'  ~[*.?]      
    ;

DOT2                 
    : '..'  ~[.]         
    ;

DOT3                 
    : '...'              
    ;

DOTASTERISK          
    : '.*'               
    ;

DOTQUESTIONMARK      
    : '.?'               
    ;

EQUAL                
    : '='   ~[>=]      
    ;

EQUALEQUAL           
    : '=='               
    ;

EQUALRARROW          
    : '=>'               
    ;

EXCLAMATIONMARK      
    : '!'  ~[=]    
    ;

EXCLAMATIONMARKEQUAL 
    : '!='               
    ;

LARROW               
    : '<'   ~[<=]      
    ;

LARROW2              
    : '<<'          
    ;

LARROW2EQUAL         
    : '<<='              
    ;

LARROWEQUAL          
    : '<='               
    ;

LBRACE               
    : '{'                
    ;

LBRACKET             
    : '['                
    ;

LPAREN               
    : '('                
    ;

MINUS                
    : '-'   ~[%=>]     
    ;

MINUSEQUAL           
    : '-='               
    ;

MINUSPERCENT         
    : '-%'   ~[=]    
    ;

MINUSPERCENTEQUAL    
    : '-%='              
    ;

MINUSRARROW          
    : '->'               
    ;

PERCENT              
    : '%'   ~[=]      
    ;

PERCENTEQUAL         
    : '%='               
    ;

PIPE                 
    : '|'   ~[|=]        
    ;

PIPE2                
    : '||'               
    ;

PIPEEQUAL            
    : '|='               
    ;

PLUS                 
    : '+'  ~[%+=]     
    ;

PLUS2                
    : '++'               
    ;

PLUSEQUAL            
    : '+='               
    ;

PLUSPERCENT          
    : '+%'    ~[=]      
    ;

PLUSPERCENTEQUAL     
    : '+%='              
    ;

LETTERC              
    : 'c'                
    ;

QUESTIONMARK         
    : '?'                
    ;

RARROW               
    : '>' ~[>=]      
    ;

RARROW2              
    : '>>'   ~[=]      
    ;

RARROW2EQUAL         
    : '>>='              
    ;

RARROWEQUAL          
    : '>='               
    ;

RBRACE               
    : '}'                
    ;

RBRACKET             
    : ']'                
    ;

RPAREN               
    : ')'                
    ;

SEMICOLON            
    : ';'                
    ;

SLASH                
    : '/'   ~[=]       
    ;

SLASHEQUAL           
    : '/='               
    ;

TILDE                
    : '~'                
    ;

// fragment
// EndofWord 
//     : ![a-zA-Z0-9_] 
//     ;

Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;


fragment
Keyword 
    : KEYWORD_ALIGN| KEYWORD_ALLOWZERO| KEYWORD_AND| KEYWORD_ANYFRAME
        | KEYWORD_ANYTYPE| KEYWORD_ASM| KEYWORD_ASYNC| KEYWORD_AWAIT
        | KEYWORD_BREAK| KEYWORD_CALLCONV| KEYWORD_CATCH| KEYWORD_COMPTIME
        | KEYWORD_CONST| KEYWORD_CONTINUE| KEYWORD_DEFER| KEYWORD_ELSE
        | KEYWORD_ENUM| KEYWORD_ERRDEFER| KEYWORD_ERROR| KEYWORD_EXPORT
        | KEYWORD_EXTERN| KEYWORD_FN| KEYWORD_FOR| KEYWORD_IF
        | KEYWORD_INLINE| KEYWORD_NOALIAS| KEYWORD_NOSUSPEND| KEYWORD_NOINLINE
        | KEYWORD_OPAQUE| KEYWORD_OR| KEYWORD_ORELSE| KEYWORD_PACKED
        | KEYWORD_PUB| KEYWORD_RESUME| KEYWORD_RETERN| KEYWORD_LINKSECTION
        | KEYWORD_STRUCT| KEYWORD_SUSPEND| KEYWORD_SWITCH| KEYWORD_TEST
        | KEYWORD_THREADLOCAL| KEYWORD_TRY| KEYWORD_UNION| KEYWORD_UNREACHABLE
        | KEYWORD_USINGNAMESPACE| KEYWORD_VAR| KEYWORD_VOLATILE| KEYWORD_WHILE 
        ;