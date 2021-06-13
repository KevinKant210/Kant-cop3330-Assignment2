/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */


package E_39Test;

import E_39.MapMaker;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class E_39AppTester {
    public static final MapMaker mapcreator = new MapMaker();

    @Test
    public void ensure_map_maker_makes_maps(){
      Map<String,String> newmap =  mapcreator.createMap("John","Johnson","not","real");

      assertEquals(newmap.get("Firstname"), "John");
    }

    @Test
    public void ensure_map_holder_holds_list_of_maps(){
        List<Map<String,String>> mapHolder = mapcreator.fillList();

        assertEquals(mapHolder.size(), 6);

    }

    @Test
    public void ensure_sort_gives_correct_first_user(){
        List<Map<String,String>> mapHolder = mapcreator.fillList();
        mapcreator.sortList(mapHolder);
        assertEquals("Jackson",mapHolder.get(0).get("Lastname"));
    }
}
