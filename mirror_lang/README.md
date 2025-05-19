# Příkazy
  - `java -jar $env:ANTLR_JAR -Dlanguage=Java -visitor MirrorLang.g4 -o gen`
  - `javac -cp ".;$env:ANTLR_JAR" .\*.java .\gen\*.java -d bin`
  - `java -cp ".;$env:ANTLR_JAR;bin" Main test/valid/program2.mirror`

# Todo
  - error listener
  - tidy comments
  - valid/invalid examples
  - 'make' control commands
