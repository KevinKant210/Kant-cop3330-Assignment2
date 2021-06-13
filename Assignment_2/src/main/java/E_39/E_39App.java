/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_39;

import java.util.*;
import java.text.*;


public class E_39App {
    public static final MapMaker mapMaker = new MapMaker();
    public static List<Map<String,String>> mapholder;
    public static void main(String[] args) {



        mapholder = mapMaker.fillList();
        mapMaker.sortList(mapholder);
        showTable();

    }

    private static void showTable() {
        System.out.println(String.format("%-"+20+"s|"+"%-"+20+"s|"+"%-"+20+"s|","Name","Position","Seperation Date"));

        String newline = "--------------------|";

        System.out.println(newline+newline+newline);


        for(int i = 0 ; i < mapholder.size(); i++){
            System.out.println(String.format("%-"+20+"s|"+"%-"+20+"s|"+"%-"+20+"s|",mapholder.get(i).get("Firstname")+" "+mapholder.get(i).get("Lastname"),mapholder.get(i).get("Position"),mapholder.get(i).get("Seperationdate")));
        }
    }


}

