package com.company;
import java.util.Random;
import java.util.Scanner;
class game {
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

     public game() {
        Random ran_num = new Random();
        this.number = ran_num.nextInt(100,200);
    }

    void takeUserInput() {
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.format("yes!!!  you guessed it right it was %d \n you guessed it in %d attempts", number, noOfGuesses);

            return true;
        }

        else if (inputNumber<number){
            System.out.println("too low...");
        }
        else if (inputNumber>number){
            System.out.println("too high...");
        }
        return false;

    }
}
// public void getNumber(int number){
public class CWH_43_exercise3 {
    public static void main(String[]args){
        /*
        Create a class Game ,Which allow a user to play "Guss the number"
        game once.Game should have the following methods:
        1.Constructor to generate the random number
        2.TakeUserInput() to take a user input of number
        3.isCorrectNumber() to detect whether the num ber entered by the user is true use properties such as
        noOfGuesses(int), etc to get task done!
        4.getter and setter for noOfGuesses
        */
       game player =new game();
       boolean b=false;
       while(!b) {
           player.takeUserInput();
           b=player.isCorrectNumber();
           System.out.println(b);
       }
    }
}
