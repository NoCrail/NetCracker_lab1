package validators;

import models.Contract;

import java.util.ArrayList;
import java.util.List;

import static utils.StringUtils.append;

public class Validator<T> {
    private final List<Condition<T>> conditions;

    public Validator(final List<Condition<T>> conditions) {
        this.conditions = conditions;
    }

    public List<CheckingResult> validate(T object) {
        List<CheckingResult> results = new ArrayList<>();

        for (Condition<T> condition : conditions) {
            Object expected = condition.getExpected();
            Object actual = condition.getSelector().select(object);
            boolean isValid = condition.getVerifier().verify(expected, actual);

            results.add(new CheckingResult(isValid,
                    createResultMessage(expected, actual, isValid, condition.getType())
            ));
        }

        return results;
    }

    private String createResultMessage(Object expected, Object actual, boolean isValid, Conditions type) {
        StringBuilder sb = new StringBuilder();

        sb.append("Validation ");
        if (isValid)
            sb.append("success: ");
        else
            sb.append("error: ");

        appendCondition(sb, expected, actual, isValid, type);

        return sb.toString();
    }

    private void appendCondition(StringBuilder sb, Object expected, Object actual, boolean isValid, Conditions type) {
        if (type == null) {
            append(sb, "expected: [", expected, "], actual: [", actual, "]");
        } else {
            append(sb, "expected value [", expected, "] ");
            if (!isValid)
                sb.append("not ");
            append(sb, type.value(), " actual value [", actual, "]");
        }
    }
}
