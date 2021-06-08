package E_01;

import java.util.Arrays;
import java.util.Locale;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kevin Kant
 */
public class AnagramWorker {

    public boolean IsAnagram(String s1, String s2){

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] word1 = s1.toCharArray();
        char[] word2 = s2.toCharArray();
        if(s1.length() != s2.length()){
            return false;
        }

        Arrays.sort(word1);
        Arrays.sort(word2);

        for(int i = 0 ; i < word1.length; i++){
            if(word1[i] != word2[i]){
                return false;
            }
        }



        return true;
    }


}
