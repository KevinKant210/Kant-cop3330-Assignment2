package E_25;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kevin Kant
 */
public class E_25App {
    private static final Scanner reader = new Scanner(System.in);
    private static final CheckPass passChecker = new CheckPass();
    public static void main( String[] args ){

        System.out.print("Please Enter Your Password: ");
        String userPass = reader.next();


        int userScore = passChecker.passwordValidator(userPass);

        UserPassResult(userPass, userScore);
    }

    private static void UserPassResult(String userPass, int userScore) {
        if(userScore == 4){
            System.out.printf("%s is a very strong password", userPass);
        }else if(userScore == 3){
            System.out.printf("%s is a strong password", userPass);
        }else if(userScore == 2){
            System.out.printf("%s is a weak password", userPass);
        }else{
            System.out.printf("%s is a very weak password", userPass);
        }
    }


}
