/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_33;

import E_32.UtilityClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E_33App {
    public static final Scanner reader = new Scanner(System.in);
    public static final List<String> quotesArray = new ArrayList<>();
    public static void main(String[] args) {

        fillArray();

        promptUserForQuestion();

        System.out.println(giveUserAnswer());


    }

    private static String promptUserForQuestion() {
        System.out.print("What is your question? ");
        return reader.nextLine();
    }

    public static String giveUserAnswer(){


        return quotesArray.get(UtilityClass.getRand(1,4));



    }

    public static void fillArray(){
        quotesArray.add("Yes");
        quotesArray.add("No");
        quotesArray.add("Maybe");
        quotesArray.add("Ask Again Later");
    }

}
