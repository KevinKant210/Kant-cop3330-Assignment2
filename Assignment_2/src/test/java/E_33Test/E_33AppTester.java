/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_33Test;

import E_32.E_32App;
import E_33.E_33App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class E_33AppTester {



    @Test
    public void ensure_program_outputs_valid_string(){
        String answer = E_33App.giveUserAnswer();
        boolean validOutput = false;
        for(int i = 0; i < 4; i++){
            if(answer.compareTo(E_33App.quotesArray.get(i)) == 0){
                validOutput = true;
                break;
            }
        }

        assertTrue(validOutput);

    }

    @Test
    public void ensure_Array_is_filled_after_calling_fill_array(){
        E_33App.fillArray();
        assertEquals(4, E_33App.quotesArray.size());
    }
}
