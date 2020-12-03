package validators;

import java.util.ArrayList;
import java.util.List;

public class ValidatorBuilder<T> {
    private final List<Condition<T>> conditions = new ArrayList<>();

    public ValidatorBuilder<T> add(Condition<T> condition) {
        conditions.add(condition);
        return this;
    }

    public Validator build() {
        return new Validator(conditions);
    }
}
