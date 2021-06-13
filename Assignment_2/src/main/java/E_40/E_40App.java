/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_40;

import E_39.MapMaker;

import java.util.*;

public class E_40App {
    public static final Scanner reader = new Scanner(System.in);
    public static final MapMaker mapWorker = new MapMaker();
    public static final List<Map<String,String>> mapHolder = mapWorker.fillList();
    public static void main(String[] args) {

        System.out.print("Please Enter a Search String: ");
        String search = reader.next();


        showFoundEmployee(search);

    }

    private static void showFoundEmployee(String search) {
        List<Integer> foundEmployee = findEmployee(search);
        if(foundEmployee.isEmpty()){
            System.out.println("Employee not found");
        }else{
            System.out.println(String.format("%-"+20+"s|"+"%-"+20+"s|"+"%-"+20+"s|","Name","Position","Seperation Date"));

            String newline = "--------------------|";

            System.out.println(newline+newline+newline);

            for(int i = 0 ; i < foundEmployee.size(); i++){
                System.out.println(String.format("%-"+20+"s|"+"%-"+20+"s|"+"%-"+20+"s|",mapHolder.get(foundEmployee.get(i)).get("Firstname")+" "+mapHolder.get(foundEmployee.get(i)).get("Lastname"),mapHolder.get(foundEmployee.get(i)).get("Position"),mapHolder.get(foundEmployee.get(i)).get("Seperationdate")));
            }
        }
    }

    public static List<Integer> findEmployee(String search){
        List<Integer> foundIndex = new ArrayList<>();

        for(int i = 0 ; i < mapHolder.size(); i++){
            if(mapHolder.get(i).get("Firstname").contains(search) || mapHolder.get(i).get("Lastname").contains(search)){
                foundIndex.add(i);
            }
        }
        return foundIndex;
    }
}
