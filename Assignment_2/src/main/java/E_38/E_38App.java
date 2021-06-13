/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_38;

import java.util.ArrayList;
import java.util.Scanner;

public class E_38App {
    public static final Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Please Enter Numbers Seperated by spaces: ");
        String userIn = reader.nextLine();

        int[] evenArray = filterEvenNumbers(convertToArray(userIn));

        System.out.print("The Even Numbers Are: ");
        for(int i = 0 ; i < evenArray.length; i++) System.out.printf("%d ", evenArray[i]);

    }

    public static int[] filterEvenNumbers(int[] userArray){
        ArrayList<Integer> evenArray = new ArrayList<>();



        for(int i = 0 ; i < userArray.length; i++){
            if(userArray[i] % 2 == 0){
                evenArray.add(userArray[i]);
            }
        }

        int[] outputArray = new int[evenArray.size()];
        for(int i = 0 ; i < evenArray.size();i++){
            outputArray[i] = evenArray.get(i);
        }

        return outputArray;
    }

    public static int[] convertToArray(String array){

        String[] parsedArray = array.split(" ");

        int[] intArray = new int[parsedArray.length];
        for(int i = 0 ; i < parsedArray.length; i++){
            intArray[i] = Integer.parseInt(parsedArray[i]);
        }

        return intArray;
    }
}
