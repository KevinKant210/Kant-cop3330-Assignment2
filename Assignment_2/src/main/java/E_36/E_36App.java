/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_36;

import java.util.ArrayList;
import java.util.Scanner;


import NiceClasses.*;

public class E_36App {
    public static final Scanner reader = new Scanner(System.in);
    public static ArrayList<Float> userInput = new ArrayList<>();
    public static void main(String[] args) {
        grabInput();

        spitOutput();
    }

    private static void spitOutput() {
        System.out.printf("The Average is: %.2f%n", getStatistics.average(userInput));
        System.out.printf("The Max is %.2f%n",getStatistics.max(userInput));
        System.out.printf("The Min is %.2f%n",getStatistics.min(userInput));
        System.out.printf("The Standard deviation is %.2f%n",getStatistics.std(userInput));
    }

    private static void grabInput() {
        String holder;
        boolean exit = false;
        while(!exit){
            System.out.print("Please Enter a Number: ");
            holder = reader.next();

            if(holder.compareTo("done") == 0){
                exit = true;
            }else if(!CheckInput.isNum(holder)){
                System.out.println("Invalid Input");
            }else{
                userInput.add(Float.parseFloat(holder));
            }
        }
    }
}
