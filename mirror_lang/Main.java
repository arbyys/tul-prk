import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No args provided");
            return;
        }

        try {
            String source = Files.readString(Paths.get(args[0]));

            MirrorLangLexer lexer = new MirrorLangLexer(CharStreams.fromString(source));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MirrorLangParser parser = new MirrorLangParser(tokens);

            lexer.removeErrorListeners();
            parser.removeErrorListeners();

            lexer.addErrorListener(ErrorListener.INSTANCE);
            parser.addErrorListener(ErrorListener.INSTANCE);

            ParseTree tree = parser.program();

            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.err.println("Parsing failed; " + parser.getNumberOfSyntaxErrors() + " syntax errors found.");
                System.exit(1);
            }

            Interpreter interpreter = new Interpreter();
            interpreter.visit(tree);

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        } catch (ParseCancellationException e) {
            System.err.println("Parsing cancelled: " + e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            System.err.println("Execution error: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}
