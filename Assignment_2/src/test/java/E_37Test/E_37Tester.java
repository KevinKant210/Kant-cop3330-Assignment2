/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_37Test;
import E_37.E_37App;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class E_37Tester {


    @Test
    void test_if_array_fill_fills_arrays(){
        E_37App.fillArrays();

        assertTrue(E_37App.letterChars.size() != 0 && E_37App.numChars.size() != 0 && E_37App.specialChars.size() != 0);

    }

    @Test
    void test_if_pass_generator_generates_passwords(){
        E_37App.fillArrays();
        String password = E_37App.generatePassword(10,2,2);

        assertTrue(password.length() == 10);

    }

    @Test
    void test_if_pass_generator_exits_when_invalid_params(){
        E_37App.fillArrays();
        assertEquals("Please Allow A Bigger Password",E_37App.generatePassword(4,2,2));
    }


}
