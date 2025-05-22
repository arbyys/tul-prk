import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ErrorListener extends BaseErrorListener {
    
    public static final ErrorListener INSTANCE = new ErrorListener();
    
    private ErrorListener() {
    }
    
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, 
                            Object offendingSymbol, 
                            int line, 
                            int charPositionInLine, 
                            String msg, 
                            RecognitionException e) {
        
        String errorMessage = String.format("Syntax Error at line %d:%d - %s", 
                                           line, 
                                           charPositionInLine, 
                                           msg);
        
        System.err.println(errorMessage);
        
        if (offendingSymbol instanceof Token) {
            Token token = (Token) offendingSymbol;
            String tokenText = token.getText();
            if (tokenText != null) {
                System.err.println("Wrong symbol: '" + tokenText + "'");
            }
        }
        
        throw new ParseCancellationException("Syntax error found");
    }
}
