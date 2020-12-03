package validators;

import models.Contract;

@FunctionalInterface
public interface Selector<T, E> {
    T select(E object);
}