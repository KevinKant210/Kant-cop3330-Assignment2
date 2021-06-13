/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_39;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class MapMaker {

    public List<Map<String,String>> fillList(){
        List<Map<String,String>> mapHolder = new ArrayList<>();

        mapHolder.add(createMap("John","Johnson","Manager","2016-12-31"));

        mapHolder.add(createMap("Tou","Xiong","Software Engineer","2016-10,05"));

        mapHolder.add(createMap("Michaela","Michaelson","District Manager", "2015-12-19"));

        mapHolder.add(createMap("Jake","Jacobson","Programmer",""));

        mapHolder.add(createMap("Jacquelyn","Jackson","DBA",""));

        mapHolder.add(createMap("Sally","Webber","Web Developer","2015-12-18"));

        return mapHolder;
    }

    public Map<String,String> createMap(String Firstname, String Lastname, String Position, String SeperationDate){



            HashMap<String,String> newMap = new HashMap<>();
            newMap.put("Firstname", Firstname);
            newMap.put("Lastname", Lastname);
            newMap.put("Position", Position);
            newMap.put("Seperationdate", SeperationDate);



        return newMap;
    }

    public void sortList(List<Map<String,String>> mapHolder){
        Collections.sort(mapHolder,new SortMap());

    }

    class SortMap implements Comparator<Map<String,String>>{
        public int compare(Map<String,String> m1, Map<String,String> m2){
            return m1.get("Lastname").compareTo(m2.get("Lastname"));
        }
    }




}
