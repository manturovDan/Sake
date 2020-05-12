package man.dan.errors;

public class SemanticSakeError extends Exception {
    protected String message;

    public SemanticSakeError(String msg) {
        message = msg;
    }

    public String toString() {
        return message;
    }
}
