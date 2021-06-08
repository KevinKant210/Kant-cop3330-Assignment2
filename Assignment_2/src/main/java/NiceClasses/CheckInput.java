package NiceClasses;

import java.util.Arrays;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kevin Kant
 */
public class CheckInput {

    public static boolean isNum(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public static boolean hasNums(String s){
        char[] string = s.toCharArray();

        for(char c : string){
            if(Character.isDigit(c)){
                return true;
            }
        }

        return false;
    }

    public static boolean hasSpecialChar(String s){
        char[] string = s.toCharArray();

        for(char c : string){
            if(!Character.isAlphabetic(c) && !Character.isDigit(c)){
                return true;
            }
        }

        return false;
    }
}
