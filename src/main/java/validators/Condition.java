package validators;

/**
 * Class for conditions to validate
 * @param <E> field to validate
 */
public class Condition<E> {
    private final Object expected;
    private final Verifier<Object> verifier;
    private final Selector<Object, E> selector;
    private Conditions type;

    /**
     * Constructor for Condition
     * @param expected Expected value
     * @param selector Field for checking
     * @param verifier Verifier
     * @param <T> Type
     */
    @SuppressWarnings("unchecked")
    public <T> Condition(T expected, Selector<T, E> selector, Verifier<T> verifier) {
        this.expected = expected;
        this.selector = (Selector<Object, E>) selector;
        this.verifier = (Verifier<Object>) verifier;
    }

    /**
     * Constructor for Condition
     * @param expected Expected value
     * @param selector Field for checking
     * @param <T> Type
     */
    @SuppressWarnings("unchecked")
    public <T> Condition(T expected, Selector<T, E> selector) {
        this.expected = expected;
        this.type = Conditions.EQUALS;
        this.selector = (Selector<Object, E>) selector;
        this.verifier = Object::equals;
    }

    /**
     * Constructor for Condition
     * @param expected Expected value
     * @param type Condition type
     * @param selector
     * @param verifier
     * @param <T>
     */
    @SuppressWarnings("unchecked")
    public <T> Condition(T expected, Conditions type, Selector<T, E> selector, Verifier<T> verifier) {
        this.expected = expected;
        this.type = type;
        this.selector = (Selector<Object, E>) selector;
        this.verifier = (Verifier<Object>) verifier;
    }

    public Object getExpected() {
        return expected;
    }

    public Verifier<Object> getVerifier() {
        return verifier;
    }

    public Conditions getType() {
        return type;
    }

    public Selector<Object, E> getSelector() {
        return selector;
    }
}
