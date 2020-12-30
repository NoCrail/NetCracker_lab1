package validators;

/**
 * Class with result after checking
 */
public class CheckingResult {
    private final boolean isValid;
    private final String message;

    /**
     * Cunstructor for CheckingResult
     * @param isValid general check result
     * @param message error message
     */
    public CheckingResult(boolean isValid, String message) {
        this.isValid = isValid;
        this.message = message;
    }

    /**
     * Method returns CheckingResult's isValid state
     * @return
     */
    public boolean isValid() {
        return isValid;
    }

    /**
     * Method returns CheckingResult's message
     * @return
     */
    public String getMessage() {
        return message;
    }
}
