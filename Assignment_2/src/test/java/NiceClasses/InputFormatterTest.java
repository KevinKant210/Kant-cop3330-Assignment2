/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package NiceClasses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class InputFormatterTest {
    @Test
    void rounds_to_2_decimal_places() {
        float num1 = 50;
        float num2 = 13;
        assertEquals(3.85,InputFormatter.roundNum(num1/num2));

    }
}
