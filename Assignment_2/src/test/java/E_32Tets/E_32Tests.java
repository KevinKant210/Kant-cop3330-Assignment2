/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_32Tets;

import E_31.E_31App;
import E_32.E_32App;
import E_32.UtilityClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class E_32Tests {

    @Test

    public void set_difficulty_test_1() {
        E_32App.difficulty = 1;
        assertEquals(10, E_32App.setDifficulty());
    }
    @Test

    public void set_difficulty_test_2() {
        E_32App.difficulty = 2;
        assertEquals(100, E_32App.setDifficulty());
    }
    @Test

    public void set_difficulty_test_3() {
        E_32App.difficulty = 3;
        assertEquals(1000, E_32App.setDifficulty());
    }

    @Test
    public void get_random_int_returns_int_in_range_1_to_100(){
        int rand = UtilityClass.getRand(1,100);
        assertTrue(rand > 0 && rand < 101);
    }

    @Test
    public void get_random_int_returns_int_in_range_1_to_1000(){
        int rand = UtilityClass.getRand(1,1000);
        assertTrue(rand > 0 && rand < 1001);
    }


}
