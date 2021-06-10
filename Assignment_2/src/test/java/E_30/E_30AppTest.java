/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class E_30AppTest {

    @Test
    void test_if_line_spitter_spits_valid_lines(){

       assertEquals("  3   6   9  12", E_30App.spitLine(3,4));
    }


}
