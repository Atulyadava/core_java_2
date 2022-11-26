package com.company;
import java.util.Scanner;
public class CWH_22_ch5_do_while {
    public static void main(String[] args){
//        int a=1;
//        do{
//            System.out.println(a);
//            a++;
//        }while(a<10);
        System.out.println("n is equals to ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int j=01;
        do{
            System.out.println(j);
            j++;
        }while(j<n);
    }
}
