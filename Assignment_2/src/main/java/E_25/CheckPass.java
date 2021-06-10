package E_25;

import NiceClasses.CheckInput;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kevin Kant
 */

public class CheckPass {
    static CheckInput inputchecker = new CheckInput();
    public int passwordValidator(String password){
        int passStrength = 4;

        if(password.length() < 8){
            passStrength--;

        }

        if(inputchecker.isNum(password)){
            //we take off two points because if all nums then no combination but will sh ow up true on next test
            passStrength--;
            passStrength--;
        }

        if(!inputchecker.hasNums(password)){
            passStrength--;
        }

        if(!inputchecker.hasSpecialChar(password)){
            passStrength--;
        }

        return passStrength;
    }

    private int isWeak(String password) {
        if (inputchecker.isNum(password)){
            return 0;
        }else{
            return 1;
        }
    }


}
