package com.company;
import java.util.Scanner;
public class CWH_24_break_continue {
    public static void main(String[] args){
//        break and continue using a loop!
        System.out.println("enter the value of n::");
        Scanner sc =new Scanner(System.in);
       int n=sc.nextInt();
//        for(int i=0; i<=n; i++){
//               System.out.println(i);
//                System.out.println("java is great");
//                if(i==2){
//                   System.out.println("Ending the loop");
//               break;
//                }
//            }
//        int i=0;
//        while(i<=n){
//            System.out.println(i);
//        System.out.println("java is great");
//        if(i==2){
//            System.out.println("Ending the loop");
//            break;
//        }
//            i++;
//        }
//            System.out.println("Loop Ends here");
//
//        int i=0;
//        do{
//         System.out.println(i);
//         System.out.println("java is great");
//         if(i==2){
//             System.out.println("End the loop");
//             break;
//         }
//         i++;
//        }while(i<=n);
//       System.out.println("Loop end here");
//
//        for(int i=0;i<=n; i++){
//            if(i==2){
//                System.out.println("loop end here");
//                continue;
//            }
//               System.out.println(i);
//               System.out.println("java is Great");
//        }

        int i=0;
         do{
             i++;
             if(i==2){
             System.out.println("Ending the loop");
             continue;
             }
           System.out.println(i);
           System.out.println("java is Great");
         }while(i<=n);
       System.out.println("Loop end here");
        }
        }



