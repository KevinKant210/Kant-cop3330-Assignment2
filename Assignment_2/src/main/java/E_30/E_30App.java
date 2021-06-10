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
        String temp;
        for(int i = 1 ; i <= length; i++){
            //difference is the final number does not get the extra space when formatted
            if(i == length){
                temp = String.format("%3d",startingVal*i);
            }else {
                temp = String.format("%3d ",startingVal*i);

            }
            output += temp;

        }


        return output;
    }
}
