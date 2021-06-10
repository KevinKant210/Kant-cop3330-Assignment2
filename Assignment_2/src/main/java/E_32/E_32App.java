/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  *  Copyright 2021 first_name last_name
 *
 */

package E_32;



import java.util.Scanner;
import NiceClasses.CheckInput;


public class E_32App {
    public static final Scanner reader = new Scanner(System.in);
    public static int difficulty;
    public static String keepPlaying = "Y";

    public static void main(String[] args) {
        beginGame();
        boolean exit = false;
        while(!exit){


            System.out.printf("You got it! it took you %d tries do you want to play again (Y/N)", guessGame());
            keepPlaying = reader.next();
            if(keepPlaying.compareToIgnoreCase("n") == 0){
                exit = true;
            }
        }



    }

    private static void beginGame() {
        System.out.println("Lets Play Guess The Number!");
        String holder;
        boolean exit = false;
        while(!exit){

            System.out.print("Enter the difficulty level (1,2,3):  ");
            holder = reader.next();


            if(!CheckInput.isNum(holder)){
                System.out.println("Please enter a valid number 1,2 or 3" );
            }else{
                difficulty = Integer.parseInt(holder);
                exit = true;
            }

        }

    }



    public static int guessGame(){
        int wrongGuesses = 0;
        int rangeMax = setDifficulty();
        int winningValue = UtilityClass.getRand(1,rangeMax);

        String userinput;
        boolean exit = false;
        System.out.print("I have my number whats your guess: ");


        while(!exit){
            userinput = reader.next();

            if(!CheckInput.isNum(userinput) || Integer.parseInt(userinput) > rangeMax){
                System.out.println("Please enter a valid input: ");
                wrongGuesses++;
            }else{
                int userInt = Integer.parseInt(userinput);
                if(userInt == winningValue){
                    exit = true;

                }else if(userInt < winningValue){
                    System.out.print("Too Low! Guess Again: ");
                    wrongGuesses++;
                }else{
                    System.out.print("Too High! Guess Again: ");
                    wrongGuesses++;
                }
            }
        }

        return wrongGuesses;
    }



    public static int setDifficulty() {
        if(difficulty == 1){
            return 10;
        }else if(difficulty == 2){
            return 100;
        }else{
            return 1000;
        }
    }

    //this function is inclusive

}
