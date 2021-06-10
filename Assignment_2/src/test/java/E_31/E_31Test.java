/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_31;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class E_31Test {

    @Test
    void test_if_heartrate_calc_is_accurate_at_55_intensity(){
        E_31App.restingHR = 65;
        E_31App.age = 22;

        assertEquals(138,E_31App.heartRateCalc(55));
    }

    @Test
    void test_if_hr_calc_is_accurate_85_intensity(){
        E_31App.restingHR = 65;
        E_31App.age = 22;

        assertEquals(178,E_31App.heartRateCalc(85));
    }


}
