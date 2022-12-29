import json
import os
import shutil
import sys
from pathlib import Path

import fire
from jinja2 import Environment, FileSystemLoader
from rich.console import Console

console = Console()


def generate(name, config="./tokenizerManifests.json"):
    configPath = Path(config)
    tokenizer_src_dirpath = Path(
        "./modules/msccd_tokenizer/src/main/java/org/nagoya_u/ertl/sa"
    )
    tokenizer_src_parser_dirpath = tokenizer_src_dirpath.joinpath("parser")
    parser_controller_filepath = tokenizer_src_dirpath.joinpath("ParserController.java")

    # step1
    console.print("step1: Manifest check", style="bold cyan")
    manifest = json.load(open(configPath, "r"))
    if not name in manifest:
        console.print(
            "[italic]%s[/italic] is not defined in %s" % (name, configPath),
            style="bold red",
        )
        sys.exit(1)

    lang_setting = manifest[name]
    if not "parser" in lang_setting:
        console.print(
            "[italic]parser[/italic] is not defined in manifest %s" % (name),
            style="bold red",
        )
        sys.exit(1)

    # step2
    console.print("step2: Cleanup files", style="bold cyan")
    if os.path.isdir(tokenizer_src_parser_dirpath):
        shutil.rmtree(tokenizer_src_parser_dirpath)
    os.makedirs(tokenizer_src_parser_dirpath)

    # step3
    console.print("step3: Copy grammar definitions", style="bold cyan")
    grammer_def_dir = Path(lang_setting["parser"])
    for def_file in list(grammer_def_dir.glob("*.g4")):
        shutil.copy(def_file, tokenizer_src_parser_dirpath)

    # step4
    console.print("step4: Generate ANTLR parser files", style="bold cyan")
    os.system(
        "java -jar lib/antlr-4.8-modified.jar -package org.nagoya_u.ertl.sa.parser %s"
        % tokenizer_src_parser_dirpath.joinpath("*.g4"),
    )

    # step5
    console.print("step5: Generate controller", style="bold cyan")
    jinja_env = Environment(
        loader=FileSystemLoader(tokenizer_src_dirpath, encoding="utf8")
    )
    parser_controller_template = jinja_env.get_template("ParserController.java.jinja2")
    parser_controller_file = parser_controller_filepath.open("w")
    parser_controller_file.write(
        parser_controller_template.render(
            lexer_class=(name + "Lexer"),
            parser_class=(name + "Parser"),
            start_symbol=lang_setting["startSymbol"],
        )
    )
    parser_controller_file.close()

    # step6
    console.print("step6: Package", style="bold cyan")
    pomxml_filepath = Path("./modules/msccd_tokenizer/pom.xml")
    os.system(
        "mvn clean -f %s" % pomxml_filepath,
    )
    os.system(
        "mvn package -Dmaven.test.skip -f %s" % pomxml_filepath,
    )

    # step7
    console.print("step7: Copy tokenizer", style="bold cyan")
    tokenizer_copyto = Path("./tokenizers/").joinpath("%s_tokenizer.jar" % name)
    shutil.copy(
        Path("./modules/msccd_tokenizer/target/msccd_tokenizer-1.0-SNAPSHOT.jar"),
        tokenizer_copyto,
    )

    console.print("Tokenizer successfuly created!", style="bold green")
    console.print("Created: [bold green]%s[/bold green]" % tokenizer_copyto)


if __name__ == "__main__":
    fire.Fire(generate)
