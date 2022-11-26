package com.company;
import java.util.Scanner;
import java.util.Random;
public class TEST_for_random_choose_by_computer {
    public static  void main(String[] args){
        System.out.println("enter the number");
        Scanner sc =new Scanner(System.in);
        int user =sc.nextInt();
        if(user==1 || user==2 || user==3 ||user==4 || user==5){
            Random rand=new Random();
            int computer= rand.nextInt(5)+1;
            if(computer==1){
                System.out.println("computer choose 1");
            } if(computer==2){
                System.out.println("computer choose 2");
            } if(computer==3){
                System.out.println("computer choose 3");
            } if(computer==4){
                System.out.println("computer choose 4");
            } if(computer==5){
                System.out.println("computer choose 5");
            }
            if(user==computer){
                System.out.println("you match with computer");
            }
            else
                System.out.println("you are not mathe with computer");
        }
    }

}
