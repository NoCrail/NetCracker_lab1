package validators;

/**
 * Functional interface for Verifiers
 * @param <T> type for verifying
 */
@FunctionalInterface
public interface Verifier<T> {
    boolean verify(T expected, T actual);
}