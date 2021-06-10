/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_29;

import java.util.Scanner;
import NiceClasses.CheckInput;


public class E_29App {
    public static final Scanner reader = new Scanner(System.in);
    public static String returnRate;
    public static void main(String[] args) {
        boolean exit = false;
        while(!exit){
            System.out.print("What is the rate of your return? ");
            returnRate = reader.next();
            //I will make the argument that I do not need to test this function since its validity has been tested in NiceClasses package within the test directory
            exit = CheckInput.isNum(returnRate);

            if(!exit){
                System.out.println("Sorry. That is not a valid input");
            }

        }


        System.out.println("It will take " + doubleInvestmentCalc(Integer.parseInt(returnRate)) + " years to double your initial investment");

    }



    public static int doubleInvestmentCalc(int returnRate){

        return 72/returnRate;

    }
}
