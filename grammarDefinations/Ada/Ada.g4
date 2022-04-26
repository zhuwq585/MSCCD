/*
 * The MIT License (MIT)
 *
 * Copyright (C) 2019, Oliver Kellogg <okellogg@users.sourceforge.net>, Luke A. Guest, et al.
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * File     : ada.g4 (Ada202x grammar for ANTLR-4)
 * Project  : https://github.com/okellogg/ada_antlr_grammar
 *
 * THIS IS PRE ALPHA WORK IN PROGRESS -
 * Not yet for any kind of productive use; it will not even translate.
 *
 */

grammar Ada;

// Lexer

/* Keywords */
ABORT            : A B O R T ;
ABS              : A B S ;
ABSTRACT         : A B S T R A C T ;
ACCEPT           : A C C E P T ;
ACCESS           : A C C E S S ;
ALIASED          : A L I A S E D ;
ALL              : A L L ;
AND              : A N D ;
ARRAY            : A R R A Y ;
AT               : A T ;
BEGIN            : B E G I N ;
BODY             : B O D Y ;
CASE             : C A S E ;
CONSTANT         : C O N S T A N T ;
DECLARE          : D E C L A R E ;
DELAY            : D E L A Y ;
DELTA            : D E L T A ;
DIGITS           : D I G I T S ;
DO               : D O ;
ELSE             : E L S E ;
ELSIF            : E L S I F ;
END              : E N D ;
ENTRY            : E N T R Y ;
EXCEPTION        : E X C E P T I O N ;
EXIT             : E X I T ;
FOR              : F O R ;
FUNCTION         : F U N C T I O N ;
GENERIC          : G E N E R I C ;
GOTO             : G O T O ;
IF               : I F ;
IN               : I N ;
INTERFACE        : I N T E R F A C E ;
IS               : I S ;
LIMITED          : L I M I T E D ;
LOOP             : L O O P ;
MOD              : M O D ;
NEW              : N E W ;
NOT              : N O T ;
NuLL             : N U L L ;    // avoid NULL (conflict with ANTLR symbol)
OF               : O F ;
OR               : O R ;
OTHERS           : O T H E R S ;
OUT              : O U T ;
OVERRIDING       : O V E R R I D I N G ;
PACKAGE          : P A C K A G E ;
PARALLEL         : P A R A L L E L ;
PRAGMA           : P R A G M A ;
PRIVATE          : P R I V A T E ;
PROCEDURE        : P R O C E D U R E ;
PROTECTED        : P R O T E C T E D ;
RAISE            : R A I S E ;
RANGE            : R A N G E ;
RECORD           : R E C O R D ;
REM              : R E M ;
RENAMES          : R E N A M E S ;
REQUEUE          : R E Q U E U E ;
RETURN           : R E T U R N ;
REVERSE          : R E V E R S E ;
SELECT           : S E L E C T ;
SEPARATE         : S E P A R A T E ;
SOME             : S O M E ;
SUBTYPE          : S U B T Y P E ;
SYNCHRONIZED     : S Y N C H R O N I Z E D ;
TAGGED           : T A G G E D ;
TASK             : T A S K ;
TERMINATE        : T E R M I N A T E ;
THEN             : T H E N ;
TYPE             : T Y P E ;
UNTIL            : U N T I L ;
USE              : U S E ;
WHEN             : W H E N ;
WHILE            : W H I L E ;
WITH             : W I T H ;
XOR              : X O R ;

/* Quasi keywords for 9.5 synchronization_kind */
BY_ENTRY         : B Y '_' E N T R Y ;
BY_PROTECTED_PROCEDURE : B Y '_' P R O T E C T E D '_' P R O C E D U R E ;
OPTIONAL         : O P T I O N A L ;

/* Quasi keyword for 13.1.1 aspect_mark */
CLASS            : C L A S S ;

/* Quasi keyword for 13.11.3 storage_pool_indicator */
STANDARD         : S T A N D A R D ;

/* Fragments for case insensitivity */
fragment A : ('a'|'A');
fragment B : ('b'|'B');
fragment C : ('c'|'C');
fragment D : ('d'|'D');
fragment E : ('e'|'E');
fragment F : ('f'|'F');
fragment G : ('g'|'G');
fragment H : ('h'|'H');
fragment I : ('i'|'I');
fragment J : ('j'|'J');
fragment K : ('k'|'K');
fragment L : ('l'|'L');
fragment M : ('m'|'M');
fragment N : ('n'|'N');
fragment O : ('o'|'O');
fragment P : ('p'|'P');
fragment Q : ('q'|'Q');
fragment R : ('r'|'R');
fragment S : ('s'|'S');
fragment T : ('t'|'T');
fragment U : ('u'|'U');
fragment V : ('v'|'V');
fragment W : ('w'|'W');
fragment X : ('x'|'X');
fragment Y : ('y'|'Y');
fragment Z : ('z'|'Z');

/* Operators and special symbols*/
CONCAT             : '&'  ;
TIC                : '\'' ;
LPAREN             : '('  ;
RPAREN             : ')'  ;
MUL                : '*'  ;
PLUS               : '+'  ;
COMMA              : ','  ;
MINUS              : '-'  ;
DOT                : '.'  ;
DIV                : '/'  ;
COLON              : ':'  ;
SEMI               : ';'  ;
LESSTHAN           : '<'  ;  // avoid LT (conflict with ANTLR symbol)
EQ                 : '='  ;
GREATERTHAN        : '>'  ;  // for symmetry with LESSTHAN
AT_SIGN            : '@'  ;
LEFT_BRACKET       : '['  ;
RIGHT_BRACKET      : ']'  ;
PIPE               : '|'  ;

RIGHT_SHAFT        : '=>' ;
DOT_DOT            : '..' ;
EXPON              : '**' ;
ASSIGN             : ':=' ;
NE                 : '/=' ;
LE                 : '<=' ;
GE                 : '>=' ;
LT_LT              : '<<' ;
GT_GT              : '>>' ;
BOX                : '<>' ;

UNDERLINE          : '_'  ;

/* By happy coincidence, the RM rules are in such order that the lexer related
   rules are at the low section numbers (RM 2.3 ff.)
   This means that by and large we can continue with the lexer while actually
   tracking the RM.
   After RM 2.7, the lexer rules end and the parser rules start.
 */

// 2.3
IDENTIFIER :
   IDENTIFIER_START ( IDENTIFIER_START | IDENTIFIER_EXTEND )*
   ;

fragment LETTER_UPPERCASE  : [\p{Lu}] ;

fragment LETTER_LOWERCASE  : [\p{Ll}] ;

fragment LETTER_TITLECASE  : [\p{Lt}] ;

fragment LETTER_MODIFIER   : [\p{Lm}] ;

fragment LETTER_OTHER      : [\p{Lo}] ;

fragment NUMBER_LETTER     : [\p{Nl}] ;

// 2.3
fragment IDENTIFIER_START :
   ( LETTER_UPPERCASE
   | LETTER_LOWERCASE
   | LETTER_TITLECASE
   | LETTER_MODIFIER
   | LETTER_OTHER
   | NUMBER_LETTER
   )
   ;

// 2.3
fragment MARK_NON_SPACING        : [\p{Mn}] ;

fragment MARK_SPACING_COMBINING  : [\p{Mc}] ;

fragment NUMBER_DECIMAL          : [\p{Nd}] ;

fragment PUNCTUATION_CONNECTOR   : [\p{Pc}] ;

fragment IDENTIFIER_EXTEND :
   ( MARK_NON_SPACING
   | MARK_SPACING_COMBINING
   | NUMBER_DECIMAL
   | PUNCTUATION_CONNECTOR
   )
   ;

// 2.4
NUMERIC_LITERAL : DECIMAL_LITERAL | BASED_LITERAL
   ;

// 2.4.1
fragment DECIMAL_LITERAL : NUMERAL ( DOT NUMERAL )? ( EXPONENT )?
   ;

// 2.4.1
fragment NUMERAL : DIGIT ( ( UNDERLINE )? DIGIT )*
   ;

// 2.4.1
fragment EXPONENT : E ( PLUS )? NUMERAL | E MINUS NUMERAL
   ;

// 2.4.1
fragment DIGIT   :  '0' .. '9'
   ;

// 2.4.2
fragment BASED_LITERAL :
   BASE '#' BASED_NUMERAL ( DOT BASED_NUMERAL )? '#' ( EXPONENT )?
   ;

// 2.4.2
fragment BASE : NUMERAL
   ;

// 2.4.2
fragment BASED_NUMERAL :
   EXTENDED_DIGIT ( ( UNDERLINE )? EXTENDED_DIGIT )*
   ;

// 2.4.2
fragment EXTENDED_DIGIT : DIGIT | 'A' .. 'F' | 'a' .. 'f'
   ;

fragment GRAPHIC_CHARACTER : [\p{L}] | [\p{M}] | [\p{N}] | [\p{P}] | [\p{S}] | [\p{Zs}] ;

// 2.5
CHARACTER_LITERAL : '\'' GRAPHIC_CHARACTER '\''
   ;

// 2.6
STRING_LITERAL : '"' STRING_ELEMENT '"'
   ;

// @todo
fragment NON_QUOTATION_MARK_GRAPHIC_CHARACTER : ~[\u0021]
   ;

// 2.6
fragment STRING_ELEMENT : ( '""' | NON_QUOTATION_MARK_GRAPHIC_CHARACTER )
   ;

// Not sure if the next two rules are quite correct.
WS : ( [\p{Cc}] | [\p{Cf}] | [\p{Zs}] | [\p{Zl}] | [\p{Zp}] )* -> skip
   ;

// 2.7
COMMENT : '--' ~[\p{Zl}]*    -> channel(HIDDEN)
   ;

// Parser

// 2.8
pragma :
   PRAGMA IDENTIFIER ( LPAREN pragma_argument_association ( COMMA pragma_argument_association )* RPAREN )? SEMI
   ;

// 2.8
pragma_argument_association :
     ( IDENTIFIER RIGHT_SHAFT )? name
   | ( IDENTIFIER RIGHT_SHAFT )? expression
   | aspect_mark RIGHT_SHAFT  name
   | aspect_mark RIGHT_SHAFT  expression
   ;

// 3.1
basic_declaration :
     type_declaration | subtype_declaration
   | object_declaration | number_declaration
   | subprogram_declaration | abstract_subprogram_declaration
   | null_procedure_declaration | expression_function_declaration
   | package_declaration | renaming_declaration
   | exception_declaration | generic_declaration
   | generic_instantiation
   ;

// 3.1
defining_identifier : IDENTIFIER
   ;

// 3.2.1
type_declaration :
     full_type_declaration
   | incomplete_type_declaration
   | private_type_declaration
   | private_extension_declaration
   ;

// 3.2.1
full_type_declaration :
     TYPE defining_identifier ( known_discriminant_part )? IS type_definition
        ( aspect_specification )? SEMI
   | task_type_declaration
   | protected_type_declaration
   ;

// 3.2.1
type_definition :
     enumeration_type_definition | integer_type_definition
   | real_type_definition | array_type_definition
   | record_type_definition | access_type_definition
   | derived_type_definition | interface_type_definition
   ;

// 3.2.2
subtype_declaration :
   SUBTYPE defining_identifier IS subtype_indication
        ( aspect_specification )? SEMI
   ;

// 3.2.2
subtype_indication : ( null_exclusion )? subtype_mark ( constraint )?
   ;

// Auxiliary rule for some of the name rules italicized in Annex P,
// required for tightening up the syntax of certain names
// (library unit names etc.)
compound_name : IDENTIFIER ( DOT IDENTIFIER )*
	;

// subtype_mark auxiliary rule: (subtype_)name
// AARM 3.2.2 4.a says about subtype_mark:
// " Note that name includes attribute_reference; thus, S'Base can be used
//   as a subtype_mark. "
subtype_name : compound_name ( TIC IDENTIFIER )? ;

// 3.2.2
subtype_mark : subtype_name
   ;

// 3.2.2
constraint : scalar_constraint | composite_constraint
   ;

// 3.2.2
scalar_constraint :
   range_constraint | digits_constraint | delta_constraint
   ;

// 3.2.2
composite_constraint :
   index_constraint | discriminant_constraint
   ;

// 3.3.1
object_declaration :
     defining_identifier_list COLON ( ALIASED )? ( CONSTANT )? subtype_indication ( ASSIGN expression )?
        ( aspect_specification )? SEMI
   | defining_identifier_list COLON ( ALIASED )? ( CONSTANT )? access_definition ( ASSIGN expression )?
        ( aspect_specification )? SEMI
   | defining_identifier_list COLON ( ALIASED )? ( CONSTANT )? array_type_definition ( ASSIGN expression )?
        ( aspect_specification )? SEMI
   | single_task_declaration
   | single_protected_declaration
   ;

// 3.3.1
defining_identifier_list :
   defining_identifier ( COMMA defining_identifier )*
   ;

// 3.3.2
number_declaration :
   defining_identifier_list COLON CONSTANT ASSIGN expression SEMI
   ;

// 3.4
derived_type_definition :
   ( ABSTRACT )? ( LIMITED )? NEW subtype_indication ( ( AND interface_list )? record_extension_part )?
   ;

// 3.5
range_constraint :  RANGE range
   ;

// 3.5
range :
     range_attribute_reference
   | simple_expression DOT_DOT simple_expression
   ;

// 3.5.1
enumeration_type_definition :
   LPAREN enumeration_literal_specification ( COMMA enumeration_literal_specification )* RPAREN
   ;

// 3.5.1
enumeration_literal_specification :
   defining_identifier | defining_character_literal
   ;

// 3.5.1
defining_character_literal : CHARACTER_LITERAL
   ;

// 3.5.4
integer_type_definition :
   signed_integer_type_definition | modular_type_definition
   ;

// 3.5.4
signed_integer_type_definition :
   RANGE simple_expression DOT_DOT simple_expression
   ;

// 3.5.4
modular_type_definition :
   MOD expression
   ;

// 3.5.6
real_type_definition :
   floating_point_definition | fixed_point_definition
   ;

// 3.5.7
floating_point_definition :
   DIGITS expression ( real_range_specification )?
   ;

// 3.5.7
real_range_specification :
   RANGE simple_expression DOT_DOT simple_expression
   ;

// 3.5.9
fixed_point_definition :
   ordinary_fixed_point_definition | decimal_fixed_point_definition
   ;

// 3.5.9
ordinary_fixed_point_definition :
   DELTA expression real_range_specification
   ;

// 3.5.9
decimal_fixed_point_definition :
   DELTA expression DIGITS expression ( real_range_specification )?
   ;

// 3.5.9
digits_constraint :
   DIGITS simple_expression ( range_constraint )?
   ;

// 3.6
array_type_definition :
   unconstrained_array_definition | constrained_array_definition
   ;

// 3.6
unconstrained_array_definition :
   ARRAY LPAREN index_subtype_definition ( COMMA index_subtype_definition )* RPAREN OF component_definition
   ;

// 3.6
index_subtype_definition : subtype_mark RANGE BOX
   ;

// 3.6
constrained_array_definition :
   ARRAY LPAREN discrete_subtype_definition ( COMMA discrete_subtype_definition )* RPAREN OF component_definition
   ;

// 3.6
discrete_subtype_definition : subtype_indication | range
   ;

// 3.6
component_definition :
     ( ALIASED )? subtype_indication
   | ( ALIASED )? access_definition
   ;

// 3.6.1
index_constraint : LPAREN discrete_range ( COMMA discrete_range )* RPAREN
   ;

// 3.6.1
discrete_range : subtype_indication | range
   ;

// 3.7
discriminant_part : unknown_discriminant_part | known_discriminant_part
   ;

// 3.7
unknown_discriminant_part :  LPAREN BOX RPAREN
   ;

// 3.7
known_discriminant_part :
   LPAREN discriminant_specification ( SEMI discriminant_specification )* RPAREN
   ;

// 3.7
discriminant_specification :
     defining_identifier_list COLON ( null_exclusion )? subtype_mark ( ASSIGN default_expression )?
   | defining_identifier_list COLON access_definition ( ASSIGN default_expression )?
   ;

// 3.7
default_expression : expression
   ;

// 3.7.1
discriminant_constraint :
   LPAREN discriminant_association ( COMMA discriminant_association )* RPAREN
   ;

// discriminant_association auxiliary rule: (discriminant_)selector_name
// We don't use selector_name on the RHS because it includes operator_symbol
// which is not applicable in this context.
discriminant_selector_name : IDENTIFIER | CHARACTER_LITERAL ;

// 3.7.1
discriminant_association :
   ( discriminant_selector_name ( PIPE discriminant_selector_name )* RIGHT_SHAFT )? expression
   ;

// 3.8
record_type_definition :  ( ( ABSTRACT )? TAGGED )? ( LIMITED )? record_definition
   ;

// 3.8
record_definition :
     RECORD
        component_list
     END RECORD ( IDENTIFIER )?
   | NuLL RECORD
   ;

// 3.8
component_list :
     component_item ( component_item )*
   | ( component_item )* variant_part
   | NuLL SEMI
   ;

// 3.8
component_item : component_declaration | aspect_clause
   ;

// 3.8
component_declaration :
   defining_identifier_list COLON component_definition ( ASSIGN default_expression )?
        ( aspect_specification )? SEMI
   ;

// discriminant_association auxiliary rule: (discriminant_)direct_name
// We don't use direct_name on the RHS because it includes operator_symbol
// which is not applicable in this context.
discriminant_direct_name : IDENTIFIER ;

// 3.8.1
variant_part :
   CASE discriminant_direct_name IS
      variant
      ( variant )*
   END CASE SEMI
   ;

// 3.8.1
variant :
   WHEN discrete_choice_list RIGHT_SHAFT
      component_list
   ;

// 3.8.1
discrete_choice_list : discrete_choice ( PIPE discrete_choice )*
   ;

// 3.8.1
discrete_choice : choice_expression | subtype_indication | range | OTHERS
   ;

// 3.9.1
record_extension_part :  WITH record_definition
   ;

// 3.9.3
abstract_subprogram_declaration :
    ( overriding_indicator )?
    subprogram_specification IS ABSTRACT
        ( aspect_specification )? SEMI
   ;

// 3.9.4
interface_type_definition :
   ( LIMITED | TASK | PROTECTED | SYNCHRONIZED )? INTERFACE ( AND interface_list )?
   ;

// 3.9.4
interface_list :  subtype_mark ( AND subtype_mark )*
   ;

// 3.10
access_type_definition :
     ( null_exclusion )? access_to_object_definition
   | ( null_exclusion )? access_to_subprogram_definition
   ;

// 3.10
access_to_object_definition :
   ACCESS ( general_access_modifier )? subtype_indication
   ;

// 3.10
general_access_modifier : ALL | CONSTANT
   ;

// 3.10
access_to_subprogram_definition :
     ACCESS ( PROTECTED )? PROCEDURE parameter_profile
   | ACCESS ( PROTECTED )? FUNCTION  parameter_and_result_profile
   ;

// 3.10
null_exclusion :  NOT NuLL
   ;

// 3.10
access_definition :
     ( null_exclusion )? ACCESS ( CONSTANT )? subtype_mark
   | ( null_exclusion )? ACCESS ( PROTECTED )? PROCEDURE parameter_profile
   | ( null_exclusion )? ACCESS ( PROTECTED )? FUNCTION parameter_and_result_profile
   ;

// 3.10.1
incomplete_type_declaration :  TYPE defining_identifier ( discriminant_part )? ( IS TAGGED )? SEMI
   ;

// 3.11
declarative_part : ( declarative_item )*
   ;

// 3.11
declarative_item :
   basic_declarative_item | body
   ;

// 3.11
basic_declarative_item :
   basic_declaration | aspect_clause | use_clause
   ;

// 3.11
body : proper_body | body_stub
   ;

// 3.11
proper_body :
   subprogram_body | package_body | task_body | protected_body
   ;

// TODO: Eliminate this rule by creating rules per type of name allowed.
// 4.1
name :
     direct_name | explicit_dereference
   | indexed_component | slice
   | selected_component | attribute_reference
   | type_conversion | function_call
   | CHARACTER_LITERAL | qualified_expression
   | generalized_reference | generalized_indexing
   | target_name
   ;

// 4.1
direct_name : IDENTIFIER | operator_symbol
   ;

// 4.1
prefix : name | implicit_dereference
   ;

// 4.1
explicit_dereference :  name DOT ALL
   ;

// 4.1
implicit_dereference : name
   ;

// 4.1.1
indexed_component :  prefix LPAREN expression ( COMMA expression )* RPAREN
   ;

// 4.1.2
slice :  prefix LPAREN discrete_range RPAREN
   ;

// 4.1.3
selected_component :  prefix DOT selector_name
   ;

// 4.1.3
selector_name : IDENTIFIER | CHARACTER_LITERAL | operator_symbol
   ;

// 4.1.4
attribute_reference :
     prefix TIC attribute_designator
   | reduction_attribute_reference
   ;

// 4.1.4
attribute_designator :
     IDENTIFIER ( LPAREN expression RPAREN )?
   | ACCESS | DELTA | DIGITS | MOD
   ;

// 4.1.4
range_attribute_reference :  prefix TIC range_attribute_designator
   ;

// 4.1.4
range_attribute_designator :  RANGE ( LPAREN expression RPAREN )?
   ;

// generalized_reference auxiliary rule: (reference_object_)name
reference_object_name :  name ;

// 4.1.5
generalized_reference :  reference_object_name
   ;

// 4.1.6
generalized_indexing :  prefix actual_parameter_part
   ;

// 4.3
aggregate :
     record_aggregate | extension_aggregate | array_aggregate | delta_aggregate
   | container_aggregate
   ;

// 4.3.1
record_aggregate :  LPAREN record_component_association_list RPAREN
   ;

// 4.3.1
record_component_association_list :
     record_component_association ( COMMA record_component_association )*
   | NuLL RECORD
   ;

// 4.3.1
record_component_association :
   ( component_choice_list RIGHT_SHAFT )? expression
   | component_choice_list RIGHT_SHAFT BOX
   ;

// component_choice_list auxiliary rule: (component_)selector_name
// We don't use selector_name on the RHS because it includes operator_symbol
// which is not applicable in this context.
component_selector_name : IDENTIFIER | CHARACTER_LITERAL ;

// 4.3.1
component_choice_list :
     component_selector_name ( PIPE component_selector_name )*
   | OTHERS
   ;

// 4.3.2
extension_aggregate :
   LPAREN ancestor_part WITH record_component_association_list RPAREN
   ;

// 4.3.2
ancestor_part : expression | subtype_mark
   ;

// 4.3.3
array_aggregate :
   positional_array_aggregate | named_array_aggregate
   ;

// 4.3.3
positional_array_aggregate :
     LPAREN expression COMMA expression ( COMMA expression )* RPAREN
   | LPAREN expression ( COMMA expression )* COMMA OTHERS RIGHT_SHAFT expression RPAREN
   | LPAREN expression ( COMMA expression )* COMMA OTHERS RIGHT_SHAFT BOX RPAREN
   | LEFT_BRACKET expression ( COMMA expression )* ( COMMA OTHERS RIGHT_SHAFT expression )* RIGHT_BRACKET
   | LEFT_BRACKET expression ( COMMA expression )* COMMA OTHERS RIGHT_SHAFT BOX RIGHT_BRACKET
   | LEFT_BRACKET RIGHT_BRACKET
   ;

// 4.3.3
named_array_aggregate :
     LPAREN array_component_association_list RPAREN
   | LEFT_BRACKET array_component_association_list RIGHT_BRACKET
   ;

// 4.3.3
array_component_association_list :
   array_component_association ( COMMA array_component_association )*
   ;

// 4.3.3
array_component_association :
     discrete_choice_list RIGHT_SHAFT expression
   | discrete_choice_list RIGHT_SHAFT BOX
   | iterated_component_association
   ;

// 4.3.3
iterated_component_association :
     FOR defining_identifier IN discrete_choice_list RIGHT_SHAFT expression
   | FOR iterator_specification RIGHT_SHAFT expression
   ;

// 4.3.4
delta_aggregate : record_delta_aggregate | array_delta_aggregate
   ;

// 4.3.4
record_delta_aggregate :
   LPAREN expression WITH DELTA record_component_association_list RPAREN
   ;

// 4.3.4
array_delta_aggregate :
     LPAREN expression WITH DELTA array_component_association_list RPAREN
   | LEFT_BRACKET expression WITH DELTA array_component_association_list RIGHT_BRACKET
   ;

// 4.3.5
container_aggregate :
     null_container_aggregate
   | positional_container_aggregate
   | named_container_aggregate
   ;

// 4.3.5
null_container_aggregate : LEFT_BRACKET RIGHT_BRACKET ;

// 4.3.5
positional_container_aggregate : LEFT_BRACKET expression ( COMMA expression )* RIGHT_BRACKET ;

// 4.3.5
named_container_aggregate : LEFT_BRACKET container_element_association_list RIGHT_BRACKET ;

// 4.3.5
container_element_association_list :
    container_element_association ( COMMA container_element_association )* ;

// 4.3.5
container_element_association :
     key_choice_list RIGHT_SHAFT expression
   | key_choice_list RIGHT_SHAFT BOX
   | iterated_element_association
   ;

// 4.3.5
key_choice_list : key_choice ( PIPE key_choice )* ;

// 4.3.5 TODO (key_)expression
key_choice : expression | discrete_range ;

// 4.3.5 TODO ( USE (key_)expression)?
iterated_element_association :
    FOR loop_parameter_specification ( USE expression)? RIGHT_SHAFT expression
  | FOR iterator_specification ( USE expression )? RIGHT_SHAFT expression
  ;

// 4.4
expression :
     relation ( AND relation )*  | relation ( AND THEN relation )*
   | relation ( OR relation )*  | relation ( OR ELSE relation )*
   | relation ( XOR relation )*
   ;

// 4.4
choice_expression :
     choice_relation ( AND choice_relation )*
   | choice_relation ( OR choice_relation )*
   | choice_relation ( XOR choice_relation )*
   | choice_relation ( AND THEN choice_relation )*
   | choice_relation ( OR ELSE choice_relation )*
   ;

// 4.4
choice_relation :
   simple_expression ( relational_operator simple_expression )?
   ;

// 4.4
relation :
     simple_expression ( relational_operator simple_expression )?
   | simple_expression ( NOT )? IN membership_choice_list
   | raise_expression
   ;

// 4.4
membership_choice_list :  membership_choice ( PIPE membership_choice )*
   ;

// 4.4
membership_choice : simple_expression | range | subtype_mark
   ;

// 4.4
simple_expression :  ( unary_adding_operator )? term ( binary_adding_operator term )*
   ;

// 4.4
term :  factor ( multiplying_operator factor )*
   ;

// 4.4
factor :  primary ( EXPON primary )? | ABS primary | NOT primary
   ;

// 4.4
primary :
     NUMERIC_LITERAL | NuLL | STRING_LITERAL | aggregate
   | name | allocator | LPAREN expression RPAREN
   | LPAREN conditional_expression RPAREN | LPAREN quantified_expression RPAREN
   | LPAREN declare_expression RPAREN
   ;

// 4.5
logical_operator : AND | OR | XOR
   ;

// 4.5
relational_operator : EQ | NE | LESSTHAN | LE | GREATERTHAN | GE
   ;

// 4.5
binary_adding_operator : PLUS | MINUS | CONCAT
   ;

// 4.5
unary_adding_operator : PLUS  | MINUS
   ;

// 4.5
multiplying_operator : MUL | DIV | MOD | REM
   ;

// 4.5
highest_precedence_operator : EXPON | ABS | NOT
   ;

// 4.5.7
conditional_expression : if_expression | case_expression
   ;

// 4.5.7
if_expression :
   IF condition THEN expression
   ( ELSIF condition THEN expression )*
   ( ELSE expression )?
   ;

// 4.5.7
condition :  expression
   ;

// 4.5.7
case_expression :
   CASE expression IS
   case_expression_alternative ( COMMA
   case_expression_alternative )*
   ;

// 4.5.7
case_expression_alternative :
   WHEN discrete_choice_list RIGHT_SHAFT
        expression
   ;

// 4.5.8
quantified_expression :
     FOR quantifier loop_parameter_specification RIGHT_SHAFT predicate
   | FOR quantifier iterator_specification RIGHT_SHAFT predicate
   ;

// 4.5.8
quantifier : ALL | SOME
   ;

// 4.5.8
predicate :  expression
   ;

// 4.5.9 TODO BEGIN (body_)expression
declare_expression :
     DECLARE ( declare_item )*
     BEGIN expression
   ;

// 4.5.9
declare_item : object_declaration | object_renaming_declaration ;

// 4.5.10
reduction_attribute_reference :
    value_sequence TIC reduction_attribute_designator
  | prefix TIC reduction_attribute_designator
  ;

// 4.5.10
value_sequence :
     LEFT_BRACKET (PARALLEL ( LPAREN chunk_specification RPAREN )? )? iterated_component_association RIGHT_BRACKET
   ;

// 4.5.10 TODO (reduction_)identifier
reduction_attribute_designator : IDENTIFIER LPAREN reduction_specification RPAREN ;

// 4.5.10 TODO (reducer_)name, (initial_value_)expression[, (combiner_)name]
reduction_specification : name COMMA expression ( COMMA name )? ;

// 4.6
type_conversion :
     subtype_mark LPAREN expression RPAREN
   | subtype_mark LPAREN name RPAREN
   ;

// 4.7
qualified_expression :
   subtype_mark TIC LPAREN expression RPAREN  | subtype_mark TIC aggregate
   ;

// 4.8
allocator :
     NEW ( subpool_specification )? subtype_indication
   | NEW ( subpool_specification )? qualified_expression
   ;

// subpool_specification auxiliary rule: (subpool_handle_)name
subpool_handle_name : name ;

// 4.8
subpool_specification :  LPAREN subpool_handle_name RPAREN
   ;

// 5.1
sequence_of_statements :  statement ( statement )* ( label )*
   ;

// 5.1
statement :
   ( label )* simple_statement | ( label )* compound_statement
   ;

// 5.1
simple_statement :
     null_statement
   | assignment_statement | exit_statement
   | goto_statement | procedure_call_statement
   | simple_return_statement | entry_call_statement
   | requeue_statement | delay_statement
   | abort_statement | raise_statement
   | code_statement
   ;

// 5.1
compound_statement :
     if_statement | case_statement
   | loop_statement | block_statement
   | extended_return_statement
   | parallel_block_statement
   | accept_statement | select_statement
   ;

// 5.1
null_statement :  NuLL SEMI
   ;

// 5.1
label :  LT_LT statement_identifier GT_GT
   ;

// 5.1
// We don't use direct_name on the RHS because it includes operator_symbol.
statement_identifier :  IDENTIFIER
   ;

// assignment_statement auxiliary rule: (variable_)name
variable_name :  name ;

// 5.2
assignment_statement :
   variable_name ASSIGN expression SEMI
   ;

// 5.2.1
target_name :  AT_SIGN
   ;

// 5.3
if_statement :
   IF condition THEN
      sequence_of_statements
   ( ELSIF condition THEN
      sequence_of_statements )*
   ( ELSE
      sequence_of_statements )?
   END IF SEMI
   ;

// 5.4
case_statement :
   CASE expression IS
        case_statement_alternative
      ( case_statement_alternative )+
   END CASE SEMI
   ;

// 5.4
case_statement_alternative :
   WHEN discrete_choice_list RIGHT_SHAFT
      sequence_of_statements
   ;

// 5.5
loop_statement :
   ( statement_identifier COLON )?
   ( iteration_scheme )? LOOP
      sequence_of_statements
   END LOOP ( IDENTIFIER )? SEMI
   ;

// 5.5
iteration_scheme :
     WHILE condition
   | FOR loop_parameter_specification
   | FOR iterator_specification
   | FOR procedural_iterator
   | PARALLEL ( LPAREN chunk_specification RPAREN )?
     FOR loop_parameter_specification
   | PARALLEL ( LPAREN chunk_specification RPAREN )?
     FOR iterator_specification
   ;

// 5.5
chunk_specification :
     simple_expression
   | defining_identifier IN discrete_subtype_definition
   ;

// 5.5
loop_parameter_specification :
   defining_identifier IN ( REVERSE )? discrete_subtype_definition
   ;

// iterator_specification auxiliary rule: (iterator_)name
iterator_name :  name ;

// iterator_specification auxiliary rule: (iterable_)name
iterable_name :  name ;

// 5.5.2
iterator_specification :
     defining_identifier ( COLON loop_parameter_subtype_indication )? IN ( REVERSE )? iterator_name
   | defining_identifier ( COLON loop_parameter_subtype_indication )? OF ( REVERSE )? iterable_name
   ;

// 5.5.2
loop_parameter_subtype_indication : subtype_indication | access_definition
   ;

// 5.5.3
procedural_iterator :
   iterator_parameter_specification OF iterator_procedure_call
   ;

// 5.5.3
iterator_parameter_specification :
     formal_part
   | LPAREN IDENTIFIER ( COMMA IDENTIFIER )* RPAREN
   ;

// iterator_procedure_call auxiliary rules: (procedure_)name, (procedure_)prefix
procedure_name :  name ;
procedure_prefix :  name ;

// 5.5.3
iterator_procedure_call :
     procedure_name
   | procedure_prefix iterator_actual_parameter_part
   ;

// 5.5.3
iterator_actual_parameter_part :
   LPAREN iterator_parameter_association ( COMMA iterator_parameter_association )* RPAREN
   ;

// 5.5.3
iterator_parameter_association :
     parameter_association
   | parameter_association_with_box
   ;

// parameter_association_with_box auxiliary rule: (formal_parameter_)selector_name
// We don't use selector_name on the RHS because it includes operator_symbol
// which is not applicable in this context.
formal_parameter_selector_name : IDENTIFIER | CHARACTER_LITERAL ;

// 5.5.3
parameter_association_with_box :
   ( formal_parameter_selector_name RIGHT_SHAFT )? BOX
   ;

// 5.6
block_statement :
   ( IDENTIFIER COLON )?
   ( DECLARE
      declarative_part )?
   BEGIN
      handled_sequence_of_statements
   END ( IDENTIFIER )? SEMI
   ;

// 5.6.1
parallel_block_statement :
   PARALLEL DO
      handled_sequence_of_statements
   AND
      handled_sequence_of_statements
   ( AND
      handled_sequence_of_statements )*
   END DO SEMI
   ;

// exit_statement auxiliary rule: (loop_)name
// We don't use `name' on the RHS because it includes many alternatives
// which are not applicable in this context.
loop_name : IDENTIFIER ;

// 5.7
exit_statement :
   EXIT ( loop_name )? ( WHEN condition )? SEMI
   ;

// goto_statement auxiliary rule: (label_)name
// We don't use `name' on the RHS because it includes many alternatives
// which are not applicable in this context.
label_name : statement_identifier ;

// 5.8
goto_statement :  GOTO label_name SEMI
   ;

// 6.1
subprogram_declaration :
   ( overriding_indicator )?
   subprogram_specification
      ( aspect_specification )? SEMI
   ;

// 6.1
subprogram_specification :
     procedure_specification
   | function_specification
   ;

// 6.1
procedure_specification :  PROCEDURE defining_program_unit_name parameter_profile
   ;

// 6.1
function_specification :  FUNCTION defining_designator parameter_and_result_profile
   ;

// 6.1
designator :
   ( parent_unit_name DOT )? IDENTIFIER
   | operator_symbol
   ;

// 6.1
defining_designator : defining_program_unit_name | defining_operator_symbol
   ;

// 6.1
defining_program_unit_name :
   ( parent_unit_name DOT )? defining_identifier
   ;

// 6.1
operator_symbol :  STRING_LITERAL
   ;

// 6.1
defining_operator_symbol :  operator_symbol
   ;

// 6.1
parameter_profile :  ( formal_part )?
   ;

// 6.1
parameter_and_result_profile :
     ( formal_part )? RETURN ( null_exclusion )? subtype_mark
   | ( formal_part )? RETURN access_definition
   ;

// 6.1
formal_part :
   LPAREN parameter_specification ( SEMI parameter_specification )* RPAREN
   ;

// 6.1
parameter_specification :
     defining_identifier_list COLON ( ALIASED )? pmode ( null_exclusion )? subtype_mark ( ASSIGN default_expression )?
   | defining_identifier_list COLON access_definition ( ASSIGN default_expression )?
   ;

// 6.1  `mode' is in conflict with ANTLR4, using `pmode' instead
pmode : ( IN )? | IN OUT | OUT
   ;

// 6.1.2 TODO (global_)attribute_reference and (global_)attribute_reference
global_aspect_definition :
     primitive_global_aspect_definition
   | attribute_reference
   | global_aspect_definition CONCAT attribute_reference
   ;

// 6.1.2
primitive_global_aspect_definition :
     NuLL
   | global_mode global_name
   | global_mode global_designator
   | LPAREN global_mode global_set ( COMMA global_mode global_set )* RPAREN
   ;

// 6.1.2
global_mode : ( global_mode_qualifier )* basic_global_mode ;

// 6.1.2
global_mode_qualifier :
     SYNCHRONIZED
   | IDENTIFIER
   ;

// 6.1.2
basic_global_mode : IN | IN OUT | OUT ;

// 6.1.2
global_set :
     global_name ( COMMA global_name )*
   | global_designator
   ;

// 6.1.2
global_designator : ALL | NuLL ;

// TODO auxiliary rule, (access_)subtype_mark
access_subtype_mark : subtype_mark ;

// 6.1.2
global_name :
     object_name
   | package_name ( PRIVATE )?
   | access_subtype_mark
   | ACCESS subtype_mark
   ;

// 6.3
subprogram_body :
   ( overriding_indicator )?
   subprogram_specification
      ( aspect_specification )? IS
      declarative_part
   BEGIN
      handled_sequence_of_statements
   END ( designator )? SEMI
   ;

// 6.4
// Auxiliary rules procedure_name, procedure_prefix are defined at 5.5.3
//                                              (iterator_procedure_call)
procedure_call_statement :
     procedure_name SEMI
   | procedure_prefix actual_parameter_part SEMI
   ;

// function_call auxiliary rules for (function_)name, (function_)prefix
function_name :  name ;
function_prefix :  name ;

// 6.4
function_call :
     function_name
   | function_prefix actual_parameter_part
   ;

// 6.4
actual_parameter_part :
   LPAREN parameter_association ( COMMA parameter_association )* RPAREN
   ;

// 6.4
// Auxiliary rule formal_parameter_selector_name is defined at 5.5.3
// (parameter_association_with_box).
parameter_association :
   ( formal_parameter_selector_name RIGHT_SHAFT )? explicit_actual_parameter
   ;

// 6.4
// Auxiliary rule variable_name is defined at 5.2 (assignment_statement).
explicit_actual_parameter : expression | variable_name
   ;

// 6.5
simple_return_statement :  RETURN ( expression )? SEMI
   ;

// 6.5
extended_return_object_declaration :
   defining_identifier COLON ( ALIASED )? ( CONSTANT )? return_subtype_indication ( ASSIGN expression )?
   ;

// 6.5
extended_return_statement :
   RETURN extended_return_object_declaration ( DO
      handled_sequence_of_statements
   END RETURN )? SEMI
   ;

// 6.5
return_subtype_indication : subtype_indication | access_definition
   ;

// 6.7
null_procedure_declaration :
   ( overriding_indicator )?
   procedure_specification IS NuLL
      ( aspect_specification )? SEMI
   ;

// 6.8
expression_function_declaration :
     ( overriding_indicator )?
     function_specification IS
        LPAREN expression RPAREN
        ( aspect_specification )? SEMI
   | ( overriding_indicator )?
     function_specification IS
        aggregate
        ( aspect_specification )? SEMI
   ;

// 7.1
package_declaration :  package_specification SEMI
   ;

// 7.1
package_specification :
   PACKAGE defining_program_unit_name
        ( aspect_specification )? IS
      ( basic_declarative_item )*
   ( PRIVATE
      ( basic_declarative_item )* )?
   END ( ( parent_unit_name DOT )? IDENTIFIER )?
   ;

// 7.2
package_body :
   PACKAGE BODY defining_program_unit_name
        ( aspect_specification )? IS
      declarative_part
   ( BEGIN
      handled_sequence_of_statements )?
   END ( ( parent_unit_name DOT )? IDENTIFIER )? SEMI
   ;

// 7.3
private_type_declaration :
   TYPE defining_identifier ( discriminant_part )? IS ( ( ABSTRACT )? TAGGED )? ( LIMITED )? PRIVATE
      ( aspect_specification )? SEMI
   ;

// 7.3
private_extension_declaration :
   TYPE defining_identifier ( discriminant_part )? IS
     ( ABSTRACT )? ( LIMITED | SYNCHRONIZED )? NEW subtype_indication
     ( AND interface_list )? WITH PRIVATE
       ( aspect_specification )? SEMI
   ;

// 8.3.1
overriding_indicator :  ( NOT )? OVERRIDING
   ;

// 8.4
use_clause : use_package_clause | use_type_clause
   ;

// use_package_clause auxiliary rule: (package_)name
// We don't use `name' on the RHS because it includes many alternatives
// which are not applicable in this context.
package_name : compound_name ;

// 8.4
use_package_clause : USE package_name ( COMMA package_name )* SEMI
   ;

// 8.4
use_type_clause :  USE ( ALL )? TYPE subtype_mark ( COMMA subtype_mark )* SEMI
   ;

// 8.5
renaming_declaration :
     object_renaming_declaration
   | exception_renaming_declaration
   | package_renaming_declaration
   | subprogram_renaming_declaration
   | generic_renaming_declaration
   ;

// object_renaming_declaration auxiliary rule: (object_)name
object_name :  name ;

// 8.5.1
object_renaming_declaration :
     defining_identifier ( COLON ( null_exclusion )? subtype_mark )? RENAMES object_name
         ( aspect_specification )? SEMI
   | defining_identifier COLON access_definition RENAMES object_name
         ( aspect_specification )? SEMI
   ;

// exception_renaming_declaration auxiliary rule: (exception_)name
// We don't use `name' on the RHS because it includes many alternatives
// which are not applicable in this context.
exception_name : compound_name ;

// 8.5.2
exception_renaming_declaration :
   defining_identifier COLON EXCEPTION RENAMES exception_name
       ( aspect_specification )? SEMI
   ;

// 8.5.3
// Auxiliary rule package_name is defined at 8.4 (use_package_clause).
package_renaming_declaration :
   PACKAGE defining_program_unit_name RENAMES package_name
       ( aspect_specification )? SEMI
   ;

// subprogram_renaming_declaration auxiliary rule: (callable_entity_)name
// See also 6.4 (procedure_name, procedure_prefix, function_name, function_prefix)
callable_entity_name :  name ;

// 8.5.4
subprogram_renaming_declaration :
   ( overriding_indicator )?
   subprogram_specification RENAMES callable_entity_name
        ( aspect_specification )? SEMI
   ;

// generic_renaming_declaration auxiliary rules:
// (generic_package_)name, (generic_procedure_)name, (generic_function_)name
// We don't use `name' on the RHS because it includes many alternatives
// which are not applicable in this context.
generic_package_name   : compound_name ;
generic_procedure_name : compound_name ;
generic_function_name  : compound_name ;

// 8.5.5
generic_renaming_declaration :
     GENERIC PACKAGE defining_program_unit_name RENAMES generic_package_name
        ( aspect_specification )? SEMI
   | GENERIC PROCEDURE defining_program_unit_name RENAMES generic_procedure_name
        ( aspect_specification )? SEMI
   | GENERIC FUNCTION defining_program_unit_name RENAMES generic_function_name
        ( aspect_specification )? SEMI
   ;

// 9.1
task_type_declaration :
   TASK TYPE defining_identifier ( known_discriminant_part )?
        ( aspect_specification )? ( IS
     ( NEW interface_list WITH )?
     task_definition )? SEMI
   ;

// 9.1
single_task_declaration :
   TASK defining_identifier
        ( aspect_specification )? ( IS
     ( NEW interface_list WITH )?
     task_definition )? SEMI
   ;

// 9.1
task_definition :
     ( task_item )*
   ( PRIVATE
     ( task_item )* )?
   END ( IDENTIFIER )?
   ;

// 9.1
task_item : entry_declaration | aspect_clause
   ;

// 9.1
task_body :
   TASK BODY defining_identifier
        ( aspect_specification )? IS
     declarative_part
   BEGIN
     handled_sequence_of_statements
   END ( IDENTIFIER )? SEMI
   ;

// 9.4
protected_type_declaration :
   PROTECTED TYPE defining_identifier ( known_discriminant_part )?
        ( aspect_specification )? IS
     ( NEW interface_list WITH )?
     protected_definition SEMI
   ;

// 9.4
single_protected_declaration :
  PROTECTED defining_identifier
        ( aspect_specification )? IS
     ( NEW interface_list WITH )?
     protected_definition SEMI
   ;

// 9.4
protected_definition :
     ( protected_operation_declaration )*
   ( PRIVATE
     ( protected_element_declaration )* )?
   END ( IDENTIFIER )?
   ;

// 9.4
protected_operation_declaration :
     subprogram_declaration
   | entry_declaration
   | aspect_clause
   ;

// 9.4
protected_element_declaration :
     protected_operation_declaration
   | component_declaration
   ;

// 9.4
protected_body :
   PROTECTED BODY defining_identifier
        ( aspect_specification )? IS
      ( protected_operation_item )*
   END ( IDENTIFIER )? SEMI
   ;

// 9.4
protected_operation_item :
     subprogram_declaration
   | subprogram_body
   | null_procedure_declaration
   | expression_function_declaration
   | entry_body
   | aspect_clause
   ;

// 9.5
synchronization_kind : BY_ENTRY | BY_PROTECTED_PROCEDURE | OPTIONAL
   ;

// 9.5.2
entry_declaration :
   ( overriding_indicator )?
   ENTRY defining_identifier ( LPAREN discrete_subtype_definition RPAREN )? parameter_profile
       ( aspect_specification )? SEMI
   ;

// accept_statement auxiliary rule: (entry_)direct_name
// We don't use direct_name on the RHS because it includes operator_symbol.
entry_direct_name :  IDENTIFIER ;

// 9.5.2
accept_statement :
   ACCEPT entry_direct_name ( LPAREN entry_index RPAREN )? parameter_profile
      ( DO handled_sequence_of_statements END ( IDENTIFIER )? )?
   SEMI
   ;

// 9.5.2
entry_index :  expression
   ;

// 9.5.2
entry_body :
   ENTRY defining_identifier entry_body_formal_part
        ( aspect_specification )?
        entry_barrier IS
      declarative_part
   BEGIN
      handled_sequence_of_statements
   END ( IDENTIFIER )? SEMI
   ;

// 9.5.2
entry_body_formal_part :  ( LPAREN entry_index_specification RPAREN )? parameter_profile
   ;

// 9.5.2
entry_barrier :  WHEN condition
   ;

// 9.5.2
entry_index_specification :  FOR defining_identifier IN discrete_subtype_definition
   ;

// entry_call_statement auxiliary rule: (entry_)name
entry_name :  name ;

// 9.5.3
entry_call_statement :  entry_name ( actual_parameter_part )? SEMI
   ;

// requeue_statement auxiliary rule: (procedure_or_entry_)name
procedure_or_entry_name :  name ;

// 9.5.4
requeue_statement :  REQUEUE procedure_or_entry_name ( WITH ABORT )? SEMI
   ;

// 9.6
delay_statement :  delay_until_statement | delay_relative_statement
   ;

// 9.6
delay_until_statement :  DELAY UNTIL expression SEMI
   ;

// 9.6
delay_relative_statement :  DELAY expression SEMI
   ;

// 9.7
select_statement :
     selective_accept
   | timed_entry_call
   | conditional_entry_call
   | asynchronous_select
   ;

// 9.7.1
selective_accept :
   SELECT
    ( guard )?
      select_alternative
   ( OR
    ( guard )?
      select_alternative )*
   ( ELSE
      sequence_of_statements )?
   END SELECT SEMI
   ;

// 9.7.1
guard :  WHEN condition RIGHT_SHAFT
   ;

// 9.7.1
select_alternative :
     accept_alternative
   | delay_alternative
   | terminate_alternative
   ;

// 9.7.1
accept_alternative :
   accept_statement ( sequence_of_statements )?
   ;

// 9.7.1
delay_alternative :
   delay_statement ( sequence_of_statements )?
   ;

// 9.7.1
terminate_alternative :  TERMINATE SEMI
   ;

// 9.7.2
timed_entry_call :
   SELECT
      entry_call_alternative
   OR
      delay_alternative
   END SELECT SEMI
   ;

// 9.7.2
entry_call_alternative :
   procedure_or_entry_call ( sequence_of_statements )?
   ;

// 9.7.2
procedure_or_entry_call :
   procedure_call_statement | entry_call_statement
   ;

// 9.7.3
conditional_entry_call :
   SELECT
      entry_call_alternative
   ELSE
      sequence_of_statements
   END SELECT SEMI
   ;

// 9.7.4
asynchronous_select :
   SELECT
      triggering_alternative
   THEN ABORT
      abortable_part
   END SELECT SEMI
   ;

// 9.7.4
triggering_alternative :  triggering_statement ( sequence_of_statements )?
   ;

// 9.7.4
triggering_statement : procedure_or_entry_call | delay_statement
   ;

// 9.7.4
abortable_part :  sequence_of_statements
   ;

// abort_statement auxiliary rule: (task_)name
task_name :  name ;

// 9.8
abort_statement :  ABORT task_name ( COMMA task_name )* SEMI
   ;

// 10.1.1
compilation : ( compilation_unit )*
   ;

// 10.1.1
compilation_unit :
     context_clause library_item
   | context_clause subunit
   ;

// 10.1.1
library_item :
     ( PRIVATE )? library_unit_declaration
   | library_unit_body
   | ( PRIVATE )? library_unit_renaming_declaration
   ;

// 10.1.1
library_unit_declaration :
     subprogram_declaration | package_declaration
   | generic_declaration | generic_instantiation
   ;

// 10.1.1
library_unit_renaming_declaration :
     package_renaming_declaration
   | generic_renaming_declaration
   | subprogram_renaming_declaration
   ;

// 10.1.1
library_unit_body : subprogram_body | package_body
   ;

// 10.1.1
parent_unit_name :  name
   ;

// 10.1.2
context_clause :  ( context_item )*
   ;

// 10.1.2
context_item : with_clause | use_clause
   ;

// 10.1.2
with_clause : limited_with_clause | nonlimited_with_clause
   ;

// (non)limited_with_clause auxiliary rule: (library_unit_)name
// We don't use `name' on the RHS because it includes many alternatives
// which are not applicable in this context.
library_unit_name : compound_name ;

// 10.1.2
limited_with_clause :  LIMITED ( PRIVATE )? WITH library_unit_name ( COMMA library_unit_name )* SEMI
   ;

// 10.1.2
nonlimited_with_clause :  ( PRIVATE )? WITH library_unit_name ( COMMA library_unit_name )* SEMI
   ;

// 10.1.3
body_stub : subprogram_body_stub | package_body_stub | task_body_stub | protected_body_stub
   ;

// 10.1.3
subprogram_body_stub :
   ( overriding_indicator )?
   subprogram_specification IS SEPARATE
      ( aspect_specification )? SEMI
   ;

// 10.1.3
package_body_stub :
   PACKAGE BODY defining_identifier IS SEPARATE
      ( aspect_specification )? SEMI
   ;

// 10.1.3
task_body_stub :
   TASK BODY defining_identifier IS SEPARATE
      ( aspect_specification )? SEMI
   ;

// 10.1.3
protected_body_stub :
   PROTECTED BODY defining_identifier IS SEPARATE
      ( aspect_specification )? SEMI
   ;

// 10.1.3
subunit :
   SEPARATE LPAREN parent_unit_name RPAREN
   proper_body
   ;

// 11.1
exception_declaration :
   defining_identifier_list COLON EXCEPTION
      ( aspect_specification )? SEMI
   ;

// 11.2
handled_sequence_of_statements :
   sequence_of_statements
   ( EXCEPTION
       exception_handler
    ( exception_handler )* )?
   ;

// 11.2
exception_handler :
   WHEN ( choice_parameter_specification COLON )? exception_choice ( PIPE exception_choice )* RIGHT_SHAFT
      sequence_of_statements
   ;

// 11.2
choice_parameter_specification :  defining_identifier
   ;

// 11.2
// Auxiliary rule exception_name is defined at 8.5.2 (exception_renaming_declaration)
exception_choice : exception_name | OTHERS
   ;

// 11.3
raise_statement :
     RAISE SEMI
   | RAISE exception_name ( WITH expression )? SEMI
   ;

// 11.3
raise_expression :  RAISE exception_name ( WITH simple_expression )?
   ;

// 12.1
generic_declaration : generic_subprogram_declaration | generic_package_declaration
   ;

// 12.1
generic_subprogram_declaration :
   generic_formal_part  subprogram_specification
        ( aspect_specification )? SEMI
   ;

// 12.1
generic_package_declaration :
   generic_formal_part  package_specification SEMI
   ;

// 12.1
generic_formal_part :  GENERIC ( generic_formal_parameter_declaration | use_clause )*
   ;

// 12.1
generic_formal_parameter_declaration :
     formal_object_declaration
   | formal_type_declaration
   | formal_subprogram_declaration
   | formal_package_declaration
   ;

// 12.3
// Auxiliary rules generic_package_name, generic_procedure_name, generic_function_name
// are defined at 8.5.5 (generic_renaming_declaration).
generic_instantiation :
     PACKAGE defining_program_unit_name IS
         NEW generic_package_name ( generic_actual_part )?
            ( aspect_specification )? SEMI
   | ( overriding_indicator )?
     PROCEDURE defining_program_unit_name IS
         NEW generic_procedure_name ( generic_actual_part )?
            ( aspect_specification )? SEMI
   | ( overriding_indicator )?
     FUNCTION defining_designator IS
         NEW generic_function_name ( generic_actual_part )?
            ( aspect_specification )? SEMI
   ;

// 12.3
generic_actual_part :
   LPAREN generic_association ( COMMA generic_association )* RPAREN
   ;

// generic_association auxiliary rule: (generic_formal_parameter_)selector_name
// We don't use selector_name on the RHS because it includes operator_symbol
// which is not applicable in this context.
generic_formal_parameter_selector_name :  formal_parameter_selector_name ;

// 12.3
generic_association :
   ( generic_formal_parameter_selector_name RIGHT_SHAFT )? explicit_generic_actual_parameter
   ;

// explicit_generic_actual_parameter auxiliary rule: (subprogram_)name
subprogram_name :  name ;

// explicit_generic_actual_parameter auxiliary rule: (package_instance_)name
// We don't use `name' on the RHS because it includes many alternatives
// which are not applicable in this context.
package_instance_name :  package_name ;

// 12.3
explicit_generic_actual_parameter :
     expression | variable_name
   | subprogram_name | entry_name | subtype_mark
   | package_instance_name
   ;

// 12.4
formal_object_declaration :
     defining_identifier_list COLON pmode ( null_exclusion )? subtype_mark ( ASSIGN default_expression )?
        ( aspect_specification )? SEMI
   | defining_identifier_list COLON pmode access_definition ( ASSIGN default_expression )?
        ( aspect_specification )? SEMI
   ;

// 12.5
formal_type_declaration :
     formal_complete_type_declaration
   | formal_incomplete_type_declaration
   ;

// 12.5
formal_complete_type_declaration :
   TYPE defining_identifier ( discriminant_part )? IS formal_type_definition
        ( aspect_specification )? SEMI
   ;

// 12.5
formal_incomplete_type_declaration :
   TYPE defining_identifier ( discriminant_part )? ( IS TAGGED )? SEMI
   ;

// 12.5
formal_type_definition :
     formal_private_type_definition
   | formal_derived_type_definition
   | formal_discrete_type_definition
   | formal_signed_integer_type_definition
   | formal_modular_type_definition
   | formal_floating_point_definition
   | formal_ordinary_fixed_point_definition
   | formal_decimal_fixed_point_definition
   | formal_array_type_definition
   | formal_access_type_definition
   | formal_interface_type_definition
   ;

// 12.5.1
formal_private_type_definition :  ( ( ABSTRACT )? TAGGED )? ( LIMITED )? PRIVATE
   ;

// 12.5.1
formal_derived_type_definition :
   ( ABSTRACT )? ( LIMITED | SYNCHRONIZED )? NEW subtype_mark ( ( AND interface_list )? WITH PRIVATE )?
   ;

// 12.5.2
formal_discrete_type_definition :  LPAREN BOX RPAREN
   ;

// 12.5.2
formal_signed_integer_type_definition :  RANGE BOX
   ;

// 12.5.2
formal_modular_type_definition :  MOD BOX
   ;

// 12.5.2
formal_floating_point_definition :  DIGITS BOX
   ;

// 12.5.2
formal_ordinary_fixed_point_definition :  DELTA BOX
   ;

// 12.5.2
formal_decimal_fixed_point_definition :  DELTA BOX DIGITS BOX
   ;

// 12.5.3
formal_array_type_definition :  array_type_definition
   ;

// 12.5.4
formal_access_type_definition :  access_type_definition
   ;

// 12.5.5
formal_interface_type_definition :  interface_type_definition
   ;

// 12.6
formal_subprogram_declaration :
     formal_concrete_subprogram_declaration
   | formal_abstract_subprogram_declaration
   ;

// 12.6
formal_concrete_subprogram_declaration :
   WITH subprogram_specification ( IS subprogram_default )?
        ( aspect_specification )? SEMI
   ;

// 12.6
formal_abstract_subprogram_declaration :
   WITH subprogram_specification IS ABSTRACT ( subprogram_default )?
        ( aspect_specification )? SEMI
   ;

// 12.6
subprogram_default : default_name | BOX | NuLL
   ;

// 12.6
default_name :  name
   ;

// 12.7
// Auxiliary rule generic_package_name is defined at 8.5.5 (generic_renaming_declaration)
formal_package_declaration :
   WITH PACKAGE defining_identifier IS NEW generic_package_name formal_package_actual_part
        ( aspect_specification )? SEMI
   ;

// 12.7
formal_package_actual_part :
     LPAREN ( OTHERS RIGHT_SHAFT )? BOX  RPAREN
   | ( generic_actual_part )?
   | LPAREN formal_package_association ( COMMA formal_package_association )* ( COMMA OTHERS RIGHT_SHAFT BOX )? RPAREN
   ;

// 12.7
// Auxiliary rule generic_formal_parameter_selector_name is defined at 12.3
//                                                    (generic_association)
formal_package_association :
     generic_association
   | generic_formal_parameter_selector_name RIGHT_SHAFT BOX
   ;

// 13.1
aspect_clause :
     attribute_definition_clause
   | enumeration_representation_clause
   | record_representation_clause
   | at_clause
   ;

// 13.1
// Auxiliary rule library_unit_name is defined at 10.1.2 (limited_with_clause)
local_name :
     direct_name
   | direct_name TIC attribute_designator
   | library_unit_name
   ;

// 13.1.1
aspect_specification :
   WITH aspect_mark ( RIGHT_SHAFT aspect_definition )? ( COMMA
        aspect_mark ( RIGHT_SHAFT aspect_definition )? )*
   ;

// 13.1.1
aspect_mark :  IDENTIFIER ( TIC CLASS )?
   ;

// 13.1.1
aspect_definition :
   name | expression | IDENTIFIER | aggregate | global_aspect_definition
   ;

// 13.3
attribute_definition_clause :
     FOR local_name TIC attribute_designator USE expression SEMI
   | FOR local_name TIC attribute_designator USE name SEMI
   ;

// 13.4
enumeration_representation_clause :
   FOR local_name USE enumeration_aggregate SEMI
   ;

// 13.4
enumeration_aggregate :  array_aggregate
   ;

// 13.5.1
record_representation_clause :
   FOR local_name USE
      RECORD ( mod_clause )?
        ( component_clause )*
      END RECORD ( local_name )? SEMI
   ;

// component_clause auxiliary rule: (component_)local_name
// We don't use local_name on the RHS because it includes alternatives
// which are not applicable in this context.
component_local_name :  IDENTIFIER ;

// 13.5.1
component_clause :
   component_local_name AT position RANGE first_bit DOT_DOT last_bit SEMI
   ;

// 13.5.1
position :  expression
   ;

// 13.5.1
first_bit :  simple_expression
   ;

// 13.5.1
last_bit :  simple_expression
   ;

// 13.8
code_statement :  qualified_expression SEMI
   ;

// 13.11.3
storage_pool_indicator : name | NuLL | STANDARD
   ;

// 13.12
restriction :
     IDENTIFIER
   | IDENTIFIER RIGHT_SHAFT restriction_parameter_argument
   ;

// 13.12
restriction_parameter_argument : name | expression
   ;

// J.3
delta_constraint : DELTA simple_expression ( range_constraint )?
   ;

// J.7
at_clause :  FOR direct_name USE AT expression SEMI
   ;

// J.8
mod_clause :  AT MOD expression SEMI
   ;
