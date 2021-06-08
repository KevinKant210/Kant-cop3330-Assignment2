/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package NiceClasses;



import java.text.DecimalFormat;

public class InputFormatter {
    private static final DecimalFormat df = new DecimalFormat("###.##");


    public static double roundNum(float num){
        return Math.round(num * 100.0) / 100.0;

    }

}
