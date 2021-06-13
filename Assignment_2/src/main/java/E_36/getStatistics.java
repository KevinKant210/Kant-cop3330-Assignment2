/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_36;


import java.util.*;

public class getStatistics {





    public  static float average(ArrayList<Float> userInput){

        float mean = 0;

        for(float i : userInput){
            mean += i;
        }

        return mean / (float) userInput.size();
    }

    public static float max(ArrayList<Float> userInput){
        Collections.sort(userInput);
        return userInput.get(userInput.size()-1);
    }

    public static float min(ArrayList<Float> userInput){
        Collections.sort(userInput);
        return userInput.get(0);
    }

    public static float std(ArrayList<Float> userInput){
        double std = 0;
        float average = average(userInput);
        float term1;

        for(int i = 0 ; i < userInput.size(); i++){
            term1 = userInput.get(i)-average;
            std += Math.pow(term1,2);
        }

        std = Math.sqrt((float) std/ userInput.size());

        return (float) std;
    }
}


