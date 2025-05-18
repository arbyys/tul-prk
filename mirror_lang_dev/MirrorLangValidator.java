import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MirrorLangValidator {
    
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java MirrorLangValidator <file_path>");
            System.exit(1);
        }
        
        String filePath = args[0];
        try {
            String code = new String(Files.readAllBytes(Paths.get(filePath)));
            boolean isValid = validateCode(code);
            
            if (isValid) {
                System.out.println("The code is valid Mirror Language code.");
            } else {
                System.out.println("The code contains syntax errors.");
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    
    public static boolean validateCode(String code) {
        try {
            // Create a CharStream from the input code
            CharStream input = CharStreams.fromString(code);
            
            // Create a lexer
            MirrorLangLexer lexer = new MirrorLangLexer(input);
            
            // Create a token stream
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // Create a parser
            MirrorLangParser parser = new MirrorLangParser(tokens);
            
            // Remove default error listeners
            parser.removeErrorListeners();
            
            // Add a custom error listener to catch syntax errors
            SyntaxErrorListener errorListener = new SyntaxErrorListener();
            parser.addErrorListener(errorListener);
            
            // Parse the input
            parser.program();
            
            // Check if there were any syntax errors
            return !errorListener.hasErrors();
        } catch (Exception e) {
            System.err.println("Error during parsing: " + e.getMessage());
            return false;
        }
    }
    
    // Custom error listener to track syntax errors
    private static class SyntaxErrorListener extends BaseErrorListener {
        private boolean hasErrors = false;
        
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, 
                               int line, int charPositionInLine, 
                               String msg, RecognitionException e) {
            hasErrors = true;
            System.err.println("Syntax error at line " + line + ":" + charPositionInLine + " - " + msg);
        }
        
        public boolean hasErrors() {
            return hasErrors;
        }
    }
}
