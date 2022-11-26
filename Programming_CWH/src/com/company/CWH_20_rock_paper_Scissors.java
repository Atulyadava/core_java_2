package com.company;
import java.util.Scanner;
import java.util.Random;
public class CWH_20_rock_paper_Scissors {
    public static void main(String[] args){
        System.out.println("Welcome to the Game\nChoose your option\n1) for Rock\n2)for Paper\n3)for Scissors");

        Scanner sc = new Scanner(System.in);

        int user = sc.nextInt();

        if (user == 1 || user == 2 || user == 3) {

            Random r = new Random();

            int computer = r.nextInt(3) + 1;// Generating numbers starting form 1

            //Displaying Computer's Choice

            if (computer == 1) {

                System.out.println("computer chooses Rock");

            } else if (computer == 2) {

                System.out.println("Computer chooses Paper");



            } else if (computer == 3) {

                System.out.println("Computer chooses Scissors");

            } else {

                System.out.println("code fails");

            }

            // Game Coding

            if (user == computer) {

                System.out.println("Its A Tie");

            } else if (user == 1 && computer == 3 || user == 2 && computer == 1 || user == 3 && computer == 2) {

                System.out.println("You Win");

            } else {

                System.out.println("You loose");

            }


        } else {

            System.out.println("Wrong option chosen");

        }
    }
}
