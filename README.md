# TUL: PRK –⁠⁠⁠⁠⁠⁠ návrh jazyka

## Mirror lang

### Obecné vlastnosti
- keywordy se zapisují velkými písmeny
- keyword začíná znakem `(` a ukončuje se jeho názvem pozpátku + znakem `)`
- keywordy jsou odděleny novým řádkem
    - `program ::= <keyword>\n`
      
### Proměnná
- `keyword ::= (SET <variable> = <value> TES)`
- začíná znakem `$`, zapisují se malými písmeny, lze využít znak `_`
    - `variable ::= \$[a-z][a-z0-9_]*`

### Cyklus
- chová se stejně jako while
- `keyword ::= (LOOPIF <condition>\n<program> FIPOOL)`
- `condition ::= <variable><operator><variable>`

### Podmínka
- `keyword ::= (IF <condition>\n<program> FI)`

### Komentář
- jednořádkový komentář = řádek začíná znaky `//`
    - `keyword ::= //.*`
- víceřádkový komentář
    - `keyword ::= (IGNORE <program> ERONGI)`

### Výpis hodnoty
- `keyword ::= (LOG <variable> GOL)`
- `keyword ::= (LOG .* GOL)`

### Gramatika

```ebnf
program ::= <keyword>\n

variable ::= \$[a-z][a-z0-9_]

operator ::= "+" | "-" | "*" | "/" | "^" | "%"

compare_operator ::= "==" | ">=" | ">" | "<=" | "<" | "!="

condition ::= <variable><operator><variable>

keyword ::= (SET <variable> = <value> TES) |
            (LOOPIF <condition>\n<program> FIPOOL) |
            (IF <condition>\n<program> FI) |
            (LOG <variable> GOL) |
            (LOG .* GOL) |
            //.* |
            (IGNORE <program> ERONGI) |

```

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
