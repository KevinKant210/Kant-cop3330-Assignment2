package E_02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordTester {
    public static CheckPass passchecker = new CheckPass();

    @Test
    void test_if_veryweak_pass_returns_veryweak() {
        assertEquals(0,passchecker.passwordValidator("1234"));
    }

    @Test
    void test_if_weak_returns_weak() {
        assertEquals(1,passchecker.passwordValidator("abcde"));
    }

    @Test
    void test_if_strong_returns_strong() {
        assertEquals(3,passchecker.passwordValidator("abcd1234xysss"));
    }

    @Test
    void test_of_very_strong_returns_very_strong() {
        assertEquals(4,passchecker.passwordValidator("1337@hax)r!"));
    }
}
