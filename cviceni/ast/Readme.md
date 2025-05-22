Hrátky s gcc - ukázky mezivýstupů
=================================

Co s tím?
---------
0.) Skripty pro převod užívají programy gawk a dot: ty musíte mít instalovány jako první. V Linuxu jsou to balíky gawk a graphviz.

1.) Přeložte si zdrojový kód [hello.c](./hello.c). K překladu slouží: "make ast" z [Makefile](./Makefile). Součástí cvičení jsou dva skripty, které AST v syrové podobě převádějí do formátu .dot (což je univerzálnější záznam stromů a grafů pro zobrazení).

2.) Přidejte si do kódu deklarace funkcí, upravte kód třeba tak, aby se sčítalo, aby přibyl aritmetický výraz...

3.) Projděte mezivýstupy, prohlédněte si AST v syrové podobě (to je textový soubor gcc.c.003t.original). 

4.) Soubor s převodem pro kreslený strom se jmenuje tree.dot. Mělo by se pro něj generovat png. Grafy jsou ale dost velké a ne vždy se obrázek generuje správně. Když se to stane, použijte [webgraphviz.com](http://www.webgraphviz.com/) (v učebnách se mi obrázky negenerují dobře, na domácím stroji ano). Stačí copy and paste do formuláře. Nelekněte se, přes samá úvodní cyhbová oznámení obrázek skoro není vidět, ale stačí skrolovat kousek dolů :D

Užitečné odkazy
----------------
- [Dokumentace k mezivýstupům GCC](https://gcc.gnu.org/onlinedocs/gcc/Developer-Options.html)

