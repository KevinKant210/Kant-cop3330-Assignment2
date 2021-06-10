/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class E_29Test {

    @Test
    void does_invest_calc_give_real_value(){
        assertEquals(18,E_29App.doubleInvestmentCalc(4));
    }


}
