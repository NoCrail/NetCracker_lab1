import models.Client;
import models.Gender;
import org.junit.Test;
import validators.*;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidatorTest {
    @Test
    public void test() {
        ValidatorBuilder<Client> builder = new ValidatorBuilder<>();

        Client client = new Client(0, "name", 2000L, Gender.MALE, "fsdf");

        builder.add(new Condition<>("surname", Client::getFullName));
        builder.add(new Condition<>("fsdf", Conditions.EQUALS, Client::getPassport,
                (expected, actual) -> expected.equals(actual)
        ));
        builder.add(new Condition<>(2048L, Conditions.LESS_THAN_OR_EQUALS, Client::getBirthday,
                (expected, actual) -> expected <= actual
        ));

        Validator<Client> v = builder.build();
        List<CheckingResult> results = v.validate(client);

        assertFalse(results.get(0).isValid());
        assertTrue(results.get(1).isValid());
        assertFalse(results.get(2).isValid());
    }
}
