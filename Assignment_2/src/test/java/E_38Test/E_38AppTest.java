/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_38Test;

import E_37.E_37App;
import E_38.E_38App;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class E_38AppTest {

    @Test
    void array_parse_gives_int_array_from_string_array(){
        String array = "1 2 3 4";
        int[] intArray = E_38App.convertToArray(array);
        int[] compArray = {1,2,3,4};
        boolean holder = true;

        for(int i = 0 ; i < compArray.length; i++){
            if(intArray[i] != compArray[i]){
                holder = false;
                break;
            }
        }

        assertTrue(holder);
    }

    @Test
    void make_sure_to_even_num_gives_only_even_nums(){
        int[] array = {1,3,7,2,9,3};
        int[] output = E_38App.filterEvenNumbers(array);
        assertTrue(output[0] % 2 == 0);
    }
}
