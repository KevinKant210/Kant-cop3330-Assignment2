/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_32;

import java.util.Random;

public class UtilityClass {

    public static int getRand(int min, int max){
        Random random = new Random();
        return random.nextInt(max+1-min)+min;
    }
}
