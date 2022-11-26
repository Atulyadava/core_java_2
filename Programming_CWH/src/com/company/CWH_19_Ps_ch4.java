package com.company;
import java.util.Scanner;
public class CWH_19_Ps_ch4 {
    public static void main(String[] args) {
// problem .1
//        int a=11;
//        if ( a==11){
//          System.out.println("I am 11 ");
//        }
//        else
//            System.out.println("I am Not 11");


        //problem .2
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter mathematics marks");
//        float mathematics =sc.nextFloat();
//        System.out.println("enter computer science marks");
//        float computer_science = sc.nextFloat();
//        System.out.println("enter the physics marks");
//        float physics=sc.nextFloat();
//
//        float avg= (mathematics+computer_science+physics)/3;
//        System.out.println("your over all percentage is "+avg);
//        if (avg>40 && mathematics>33 && physics>33 && computer_science>33 ){
//            System.out.println("congratulation!!! you have been promoted");
//        }
//        else
//            System.out.println("sorry!!! you have not been promoted! please try again.");

//        problem.3

//        float tax =  0;
//        Scanner sc=new Scanner(System.in);
//      System.out.println("Enter your income");
//      float income=sc.nextFloat();
//        if (income<=250000) {
//              tax = tax + 0;
//        }
//        else if (income>250000 && income<500000) {
//
//            tax = tax + 0.05f * (income - 250000f);
//        }
//        else if(income>=500000 && income<1000000) {
//             tax = tax +0.05f*(500000-250000);
//             tax =tax + 0.2f*(income-500000);
//        }
//       else if (income >=1000000f ){
//            tax = tax +0.05f*(500000-250000);
//            tax = tax +0.2f*(1000000-500000);
//            tax= tax +0.3f*(income-1000000f);
//       }
//      System.out.println("the tax of an employ is  " + tax);


//        char day;
//       int reminder;
//        System.out.println("enter the number for find the day");
//        Scanner sc =new Scanner(System.in);
//        int number=sc.nextInt();
//        reminder=(number%7);
//        if(reminder==0){
//            System.out.println("it`s sunday");
//        }
//       else if (reminder==1){
//           System.out.println(" it`s monday");
//        }
//        else if(reminder==2){
//            System.out.println("it`s tuesday");
//        }
//        else if(reminder==3){
//            System.out.println("it`s wednesday");
//        }
//        else if(reminder==4){
//            System.out.println("it`s thursday");
//        }
//        else if(reminder==5){
//            System.out.println("it`s friday");
//        }
//        else if(reminder==6){
//            System.out.println("it`s saturday");
//        }

        //problem.4
//        System.out.println("enter the number");
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        switch (day) {
//            case 1 ->System.out.println("Monday");
//            case 2 ->System.out.println("Tuesday");
//            case 3 ->System.out.println("Wednesday");
//            case 4 ->System.out.println("Thursday");
//            case 5 ->System.out.println("Friday");
//            case 6 ->System.out.println("Saturday");
//            case 7 ->System.out.println("Sunday");
//
//        }

        //problem.5

//        System.out.println("enter thr year");
//        Scanner sc= new Scanner(System.in);
//       int year=sc.nextInt();
//       if((year%400==0 || year%100!=0) && year%4==0){
//           System.out.println("this year is leap year");
//       }
//       else
//           System.out.println("it is not a leap year");

        //problem.5
         System.out.println("enter your website");
         Scanner sc =new Scanner(System.in);
         String website=sc.next();
       if(website.endsWith(".com")){
           System.out.println("your website is a commercial website");
       }
           if(website.endsWith(".org")){
               System.out.println("your website is an organization website");
       }
           if(website.endsWith(".in")){
               System.out.println("your website is an indian website");
           }
    }
}