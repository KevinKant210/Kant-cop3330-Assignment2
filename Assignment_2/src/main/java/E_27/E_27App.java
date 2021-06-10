/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_27;

import java.util.Scanner;


public class E_27App {
    public static final Scanner reader = new Scanner(System.in);
    public static String firstname;
    public static String lastname;
    public static String zip;
    public static String ID;
    public static void main(String[] args) {

        grabUserVals();

        inputValidation validator = new inputValidation();

        String output = validator.validateInput(firstname, lastname,zip ,ID);

        if(output.isEmpty()){
            output = " There were no errors found.";
        }

        System.out.println(output);

    }

    private static void grabUserVals() {
        System.out.print("Enter the first name: ");
        firstname = reader.nextLine();

        System.out.print("Enter the last name: ");
        lastname = reader.nextLine();

        System.out.print("Enter the zip code: ");
        zip = reader.next();

        System.out.print("Enter the employee ID: ");
        ID = reader.next();
    }
}
