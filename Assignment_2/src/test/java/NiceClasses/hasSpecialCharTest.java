/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package NiceClasses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class hasSpecialCharTest {


    @Test
    void contains_special_char_return_true() {
        assertTrue(CheckInput.hasSpecialChar("string%%%"));

    }

    @Test
    void doesnt_contain_special_char_returns_false() {
        assertFalse(CheckInput.hasSpecialChar("string"));
    }
}
