/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class E_28Test {

    @Test
    void test_if_sum_sums_values_properly(){
        int[] testarray = {1,2,3,4,5};
        assertEquals(15,E_28App.summarize(testarray));
    }

    @Test
    void test_of_neg_values_break_program(){
        int[] testarray = {1,2,3,4,-5};

        assertEquals(5,E_28App.summarize(testarray));
    }

}
