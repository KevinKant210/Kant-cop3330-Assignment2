package NiceClasses;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class CheckInputTester {
    static CheckInput inputcheck = new CheckInput();
    @Test
    void string_with_only_numbers_returns_true(){
        assertTrue(inputcheck.isNum("1234"));
    }

    @Test
    void string_without_only_numbers_returns_false() {
        assertFalse(inputcheck.isNum("false"));
    }

    @Test
    void string_with_num_and_char_returns_false() {
        assertFalse(inputcheck.isNum("string1string"));
    }
}
