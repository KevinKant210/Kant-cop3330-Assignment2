/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package NiceClasses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class hasNumsTester {

    @Test
    void string_with_nums_returns_true() {
        assertTrue(CheckInput.hasNums("string1string"));
    }

    @Test
    void string_without_nums_returns_false() {
        assertFalse(CheckInput.hasNums("stringwithoutnums"));
    }
}
