/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_03;

import NiceClasses.InputFormatter;

import java.util.Scanner;

public class E_03App {
    static final Scanner reader = new Scanner(System.in);
    static int n;
    static double i;
    static double b;
    static double p;
    static double apr;
    public static void main(String[] args) {

       GrabUserVal();

        i = apr/365.0;

        System.out.println("It will take " + PaymentCalculator.calculateMonthsUntilPaidOff(i,b,p) + " Months to pay off your credit card");

    }

    private static void GrabUserVal() {
        System.out.print("Pleases Enter Your Balance ");
        b = reader.nextFloat();
        System.out.print("What is the APR on the card (in percentage): ");
        apr = reader.nextFloat()/100;
        System.out.print("What is the monthly Payment You can make: ");
        p = reader.nextFloat();
    }


}
