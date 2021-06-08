package NiceClasses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class hasNumsTester {
    static CheckInput inputchecker = new CheckInput();
    @Test
    void string_with_nums_returns_true() {
        assertTrue(inputchecker.hasNums("string1string"));
    }

    @Test
    void string_without_nums_returns_false() {
        assertFalse(inputchecker.hasNums("stringwithoutnums"));
    }
}
