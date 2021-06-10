/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_30;





public class E_30App {
    public static void main(String[] args) {

        for(int i = 1 ; i <= 12; i++){
            System.out.println(spitLine(i,12));
        }

    }

    public static String spitLine(int startingVal, int length){
        String output = "";
        for(int i = 1 ; i <= length; i++){
            if(i == length){
                output += startingVal*i;
            }else {
                output += startingVal * i + " ";

            }

        }


        return output;
    }
}
