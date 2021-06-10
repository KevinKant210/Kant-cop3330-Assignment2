/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_27;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class inputValidationTest {
    inputValidation validator = new inputValidation();
    @Test
    void is_string_empty(){


        assertEquals(0,validator.isValidString(""));



    }

    @Test
    void is_string_single_char(){
        assertEquals(1,validator.isValidString("k"));
    }

    @Test
    void is_string_is_valid(){
        assertEquals(2,validator.isValidString("jimmy"));
    }


    @Test
    void zip_is_valid_num_returns_true(){
        assertTrue(validator.isValidNum("12353"));
    }

    @Test
    void zip_is_not_valid_returns_false(){
        assertFalse(validator.isValidNum("thisisnot"));
    }

    @Test
    void id_without_proper_len_returns_false(){
        assertFalse(validator.isValidID("therftgf"));
    }

    @Test
    void id_without_beginning_letters_returns_false(){
        assertFalse(validator.isValidID("12-1234"));
    }

    @Test
    void id_without_hyphen_returns_false(){
        assertFalse(validator.isValidID("AB!1234"));
    }

    @Test
    void id_without_ending_numerals_returns_false(){
        assertFalse(validator.isValidID("AB-ABCD"));
    }

    @Test
    void valid_id_returns_true(){
        assertTrue(validator.isValidID("AB-1234"));
    }


}
