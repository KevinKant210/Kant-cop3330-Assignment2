package NiceClasses;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class CheckInputTester {

    @Test
    void string_with_only_numbers_returns_true(){
        assertTrue(CheckInput.isNum("1234"));
    }

    @Test
    void string_without_numbers_returns_false() {
        assertFalse(CheckInput.isNum("false"));
    }

    @Test
    void string_with_num_and_char_returns_false() {
        assertFalse(CheckInput.isNum("string1string"));
    }
}
