/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_28;
import java.lang.reflect.Array;
import java.util.Scanner;
public class E_28App {
    public static final Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        int[] usernums = new int[5];

        for(int i = 0 ; i < usernums.length; i++){
            System.out.print("Enter a number: ");
            usernums[i] = reader.nextInt();

        }

        System.out.println("The total is " + summarize(usernums));
    }

    public static int summarize(int[] usernums){
        int sum = 0;

        for(int i = 0; i < usernums.length; i++){
            sum += usernums[i];
        }

        return sum;
    }

}
