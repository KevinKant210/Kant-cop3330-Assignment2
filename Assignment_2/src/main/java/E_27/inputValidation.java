/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_27;

import NiceClasses.CheckInput;
//import java.util.ArrayList
    import java.util.Calendar;

public class inputValidation {

    public static String validateInput(String firstname,String lastname, String zipcode, String ID){



        inputValidation validator = new inputValidation();
        if(validator.isValidString(firstname) == 0){
            String output = "First name must be filled in";
        }
        return "temp return";
    }

    public  boolean isValidID(String ID){
        if(ID.length() != 7){
            return false;
        }
        char[] idHolder = ID.toCharArray();

        if(Character.isAlphabetic(idHolder[0]) == false || Character.isAlphabetic(idHolder[1]) == false){
            return false;
        }

        if(idHolder[2] != '-'){
            return false;
        }

        for(int i = 3; i < 7; i++){
            if(!Character.isDigit(idHolder[i])){
                return false;
            }
        }
        return true;
    }


    public int isValidString(String s){
        if(s.isEmpty() || s.isBlank()){
            return 0;
        }

        if(s.length() < 2){
            return 1;
        }

        return 2;
    }

    public boolean isValidNum(String zip){
        return CheckInput.isNum(zip);
    }
}
