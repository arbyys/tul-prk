# TUL: PRK –⁠⁠⁠⁠⁠⁠ návrh jazyka

## jméno todo

### Obecné vlastnosti
- keywordy jsou odděleny novým řádkem
    - `program ::= <keyword>\n`
- keywordy se zapisují velkými písmeny
- keyword začíná znakem `(` a ukončuje se jeho názvem pozpátku + znakem `)`

### Proměnné
- `keyword ::= (SET <variable> = <value> TES)`
- zapisují se malými písmeny, lze využít znak `_`
- `variable ::= \$[a-z][a-z0-9_]*`

### Komentáře
- jednořádkový komentář = řádek začíná znaky `//`
    - `keyword ::= //.*`
- víceřádkový komentář
    - `keyword ::= (IGNORE <program>`

### Příklad kódu

```

```
