package validators;

public class CheckingResult {
    private final boolean isValid;
    private final String message;

    public CheckingResult(boolean isValid, String message) {
        this.isValid = isValid;
        this.message = message;
    }

    public boolean isValid() {
        return isValid;
    }

    public String getMessage() {
        return message;
    }
}
