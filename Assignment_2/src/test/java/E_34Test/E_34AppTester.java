/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_34Test;

import E_33.E_33App;
import E_34.E_34App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class E_34AppTester {

    @Test
    public void ensure_arraylist_gets_filled(){
        E_34App.fillInEmployees();
        System.out.println(E_34App.employeeNames.size());
        assertEquals(5, E_34App.employeeNames.size());
        E_34App.employeeNames.clear();
    }

    @Test
    public void ensure_employee_gets_terminated(){
        boolean joe_lives = true;

        E_34App.terminateEmployee("Joe Momma");


        assertFalse(E_34App.employeeNames.contains("Joe Momma"));
    }
}
