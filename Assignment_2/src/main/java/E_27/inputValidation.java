/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_27;

import NiceClasses.CheckInput;
import java.util.Arrays;
    import java.util.Calendar;

public class inputValidation {

    public String validateInput(String firstname,String lastname, String zipcode, String ID){

        inputValidation validator = new inputValidation();
        String output = "";

        int nameholder = validator.isValidString(firstname);
        if(nameholder == 0){
            output += "The first name must be filled in\n";
        }else if(nameholder == 1){
            output += "The First Name must be at least 2 characters long \n";

        }

        nameholder = validator.isValidString(lastname);

        if(nameholder == 0){
            output += "The Last name must be filled out\n";

        }else if(nameholder == 1){
            output += "The Last Name must be at least 2 characters long\n";
        }

        if(!validator.isValidID(ID)){
            output += "Employee ID must be in the format AA-1234\n";
        }

        if(!validator.isValidNum(zipcode)){
            output += "The zipcode must be a 5 digit number\n";
        }



        return output;

    }

    public  boolean isValidID(String ID){
        if(ID.length() != 7){
            return false;
        }
        char[] idHolder = ID.toCharArray();

        if(!Character.isAlphabetic(idHolder[0]) || !Character.isAlphabetic(idHolder[1])){
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
