package NiceClasses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class hasSpecialCharTest {
    static CheckInput checker = new CheckInput();

    @Test
    void contains_special_char_return_true() {
        assertTrue(checker.hasSpecialChar("string%%%"));

    }

    @Test
    void doesnt_contain_special_char_returns_false() {
        assertFalse(checker.hasSpecialChar("string"));
    }
}
