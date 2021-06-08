/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_03;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PaymentCalculatorTest {
    @Test
    void Test_case_for_Payment_calc() {


        assertEquals(70,PaymentCalculator.calculateMonthsUntilPaidOff(.12/365.0,5000,100));
    }
}
