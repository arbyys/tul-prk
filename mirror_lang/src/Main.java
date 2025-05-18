import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Main <source-file>");
            return;
        }

        try {
            String source = Files.readString(Paths.get(args[0]));
            MirrorLangLexer lexer = new MirrorLangLexer(CharStreams.fromString(source));
            MirrorLangParser parser = new MirrorLangParser(new CommonTokenStream(lexer));

            ParseTree tree = parser.program();
            Interpreter interpreter = new Interpreter();
            interpreter.visit(tree);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
