/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_37;

import java.util.*;
import E_32.UtilityClass;

public class E_37App {
    public static  final Scanner reader = new Scanner(System.in);
    public static  List<String> specialChars = new ArrayList<>();
    public static  List<String> numChars = new ArrayList<>();
    public static  List<String> letterChars = new ArrayList<>();

    public static void main(String[] args) {

        System.out.print("How long do you want your Password: ");
        int passLen = reader.nextInt();
        System.out.print("How many Special Characters: ");
        int specialLen = reader.nextInt();

        System.out.print("How many Numbers? ");
        int numLen = reader.nextInt();
        fillArrays();

        System.out.println(generatePassword(passLen,specialLen,numLen));


    }



    public static void fillArrays(){

        for(int i = 33; i < 127; i++){

            if( Character.isDigit(i)){
                numChars.add(Character.toString(i));
            }else if(Character.isAlphabetic(i)){
                letterChars.add(Character.toString(i));
            }else{
                specialChars.add(Character.toString(i));
            }
        }

    }

    public static String generatePassword(int passLen, int spcLen,int numLen) {

        int letterLen = passLen - ( spcLen + numLen);

        if ((spcLen+numLen) > passLen/2) {
            return "Please Allow A Bigger Password";
        }



        String output = "";
        while(passLen != 0){
            int rand = UtilityClass.getRand(1,3);

            if(rand == 1){
                if(letterLen == 0){
                    continue;
                }else{
                    output+=(letterChars.get(UtilityClass.getRand(0,letterChars.size()-1)));

                    letterLen--;
                    passLen--;
                }
            }else if(rand == 2){
                if(spcLen == 0){
                    continue;
                }else{
                    output+=(specialChars.get(UtilityClass.getRand(0,specialChars.size()-1)));
                    spcLen--;
                    passLen--;
                }
            }else{
                if(numLen == 0){
                    continue;
                }else{
                    output+=(numChars.get(UtilityClass.getRand(0,numChars.size()-1)));
                    numLen--;
                    passLen--;
                }
            }

        }


        return output;
    }
}
