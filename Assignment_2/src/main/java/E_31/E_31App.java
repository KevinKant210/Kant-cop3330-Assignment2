/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_31;

import NiceClasses.CheckInput;

import java.util.Scanner;

public class E_31App {
    public static int restingHR;
    public static int age;
    public static final Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {

        restingHR = Integer.parseInt(grabUserVals("Please enter your resting heart rate: "));
        age = Integer.parseInt(grabUserVals("Please enter your age: "));

        printHeartRateChart();


    }

    private static void printHeartRateChart() {
        System.out.println("Intensity \t| Rate\t");
        System.out.println("------------|--------");

        for(int i = 55; i <=95; i+=5){
            System.out.printf("%d%%\t\t\t| %d bpm%n",i,heartRateCalc(i));
        }
    }

    private static String grabUserVals(String prompt) {
        String holder= "" ;
        boolean exit = false;
        while(!exit){
            System.out.print(prompt);
            holder = reader.next();

            if(!CheckInput.isNum(holder)){
                System.out.println("Please enter a valid input");

            }else{
                exit = true;

            }

        }

        return holder;
    }


    public static int heartRateCalc(float intensity){

        float intensepercentage = intensity/ (float) 100.0;
        return (int) (((220-age)-restingHR)*intensepercentage)+restingHR;


    }
}
