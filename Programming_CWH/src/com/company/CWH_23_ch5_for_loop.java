package com.company;
import java.util.Scanner;
public class CWH_23_ch5_for_loop {
    public static void main(String[] args){

//        for(int a=1; a<=5; a++){
//        System.out.println(a);
//        }
//
//
//        System.out.println("enter the number of odd numbers you want ");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=0; i<n; i++ ){
//            System.out.println(2*i+1);//(2*n+1) for odd numbers
//        }
        for(int i=6; i>0; i--){
           System.out.println(i);
        }

        System.out.println("enter the value of n");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=n; i>0;i--){
            System.out.println(i);
        }
    }
}
