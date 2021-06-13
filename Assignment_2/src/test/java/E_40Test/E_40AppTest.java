/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_40Test;

import E_39.MapMaker;
import E_40.E_40App;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class E_40AppTest {
    public static final MapMaker mapWorker = new MapMaker();
    public static final List<Map<String,String>> mapHolder = mapWorker.fillList();


    @Test
    void test_if_search_returns_proper_index(){
        List<Integer> foundEmployee = E_40App.findEmployee("Jac");

        assertEquals(mapHolder.get(foundEmployee.get(0)).get("Firstname"), "Jake");
    }
}
