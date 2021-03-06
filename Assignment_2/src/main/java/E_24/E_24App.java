/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_24;

import java.util.Scanner;
public class E_24App
{
    private static final Scanner reader = new Scanner(System.in);

    private static String s1,s2;
    public static void main( String[] args )
    {


        AnagramWorker anagram = new AnagramWorker();

        System.out.println("Enter two strings and I will tell you if they are anagrams.");
        GrabInputs();

        TellUserResult(anagram);
    }

    private static void TellUserResult( AnagramWorker anagram) {
        String userout;
        if(anagram.IsAnagram(s1,s2)){
            userout = "are anagrams";
        }else{
            userout = "are not anagrams";
        }

        System.out.printf("%s and %s %s",s1,s2,userout);
    }

    private static void GrabInputs() {
        System.out.print("Enter the first string: ");
        s1 = reader.next();
        System.out.print("Enter the second string: ");
        s2 = reader.next();
    }



}
