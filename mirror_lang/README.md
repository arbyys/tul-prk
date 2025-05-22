# Mirror lang

## Obecné vlastnosti
- keywordy se zapisují velkými písmeny
- keyword začíná znakem `(` a ukončuje se jeho názvem pozpátku + znakem `)`
- keywordy jsou odděleny novým řádkem
    - `program ::= <keyword>\n`
      
## Proměnná
- `keyword ::= (SET <variable> = <value> TES)`
- začíná znakem `$`, zapisují se malými písmeny, lze využít znak `_`
    - `variable ::= \$[a-z][a-z0-9_]*`

## Cyklus
- chová se stejně jako while
- `keyword ::= (LOOPIF <condition>\n<program> FIPOOL)`
- `condition ::= <variable><operator><variable>`

## Podmínka
- `keyword ::= (IF <condition>\n<program> FI)`

## Komentář
- jednořádkový komentář = řádek začíná znaky `//`
    - `keyword ::= //.*`
- víceřádkový komentář
    - `keyword ::= (IGNORE <program> ERONGI)`

## Výpis hodnoty
- `keyword ::= (LOG <variable> GOL)`
- `keyword ::= (LOG .* GOL)`

### Příklad kódu

```
// example program

(SET $a = 15 TES)
(SET $b = 105 TES)

(IF $b % $a == 0 
    (LOOPIF $b > 0
        (LOG "aktuální hodnota $b:" GOL)
        (LOG $b GOL)
        (SET $b = $b - $a TES)
    FIPOOL)
FI)

(IGNORE 
    multi line
    comment
ERONGI)
```

___

# Makefile pro automatické spuštění testů
- (nutno nastavit proměnnou `ANTLR_JAR` v příkazové řádce (export nebo proměnná prostředí) nebo v Makefile)
- dostupné příkazy
    - `make clean` 
    - `make test`
        - `make test-valid`
        - `make test-invalid`
        
# Příkazy pro ruční ovládání
- `java -jar $env:ANTLR_JAR -Dlanguage=Java -visitor MirrorLang.g4 -o gen`
- `javac -cp ".;$env:ANTLR_JAR" .\*.java .\gen\*.java -d bin`
- `java -cp ".;$env:ANTLR_JAR;bin" Main test/valid/program2.mirror`