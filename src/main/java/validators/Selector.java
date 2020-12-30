package validators;

import models.Contract;

/**
 * Functional interface for choosing checking fields
 * @param <T> Object for checking
 * @param <E> Field from object for checking
 */
@FunctionalInterface
public interface Selector<T, E> {
    T select(E object);
}