/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_36Tests;

import E_36.*;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class E_36StatTest {

    public static ArrayList<Float> userin = new ArrayList<>();

    private static void addToTestArray(){
        userin.add((float) 100);
        userin.add((float) 200);
        userin.add((float) 1000);
        userin.add((float) 300);

    }





    @Test
   public void test_average_method(){

        addToTestArray();



        assertEquals(400.0,getStatistics.average(userin));
    }

    @Test
    public void test_max_method(){
        addToTestArray();
        assertEquals(1000.0,getStatistics.max(userin));
    }

    @Test
    public void test_min_method(){
        addToTestArray();
        assertEquals(100.0,getStatistics.min(userin));
    }

    @Test
    public void test_std_method(){
        addToTestArray();
        assertEquals(353.55,Math.round(getStatistics.std(userin)*100.0)/100.0);
    }

}
