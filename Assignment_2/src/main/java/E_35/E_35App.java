/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_35;

import java.util.Scanner;
import java.util.ArrayList;
import E_32.UtilityClass.*;

public class E_35App {

    public static final Scanner reader = new Scanner(System.in);
    public static ArrayList<String> players = new ArrayList<>();
    public static void main(String[] args) {

        grabUserVals();

        System.out.printf("The winner is %s", grabWinner());

    }

    public static String grabWinner() {
        return players.get(E_32.UtilityClass.getRand(0, players.size() - 1));
    }

    private static void grabUserVals() {
        boolean exit = false;
        String holder;
        while(!exit){
            System.out.print("Please Enter a name: ");
            holder = reader.nextLine();
            if(holder.isEmpty() || holder.isBlank()){
                exit = true;
            }else{
                players.add(holder);
            }
        }
    }
}
