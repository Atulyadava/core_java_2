package com.company;

public class CWH_33verargs {
//    static int sum(int a,int b){
//        return a+b ;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c ;
//    }
//    static int sum(int a,int b,int c,int d){
//        return a+b+c+d ;
//    }
//    static int sum(int...arr){
    static int sum(int x,int...arr){
       // available as int []arr;
        int result=x;
        for(int a: arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("welcome to Varargs tutorial");
        //System.out.println("the sum of nothing is :" +sum()); //if you have to put at list an element then we have to require an int x in methord
        System.out.println("the sum of 1 is :" +sum(1));
        System.out.println("the sum of 4 and 5 is :" +sum(4,5));
        System.out.println("the sum of 3,4 and 5 is :" +sum(3,4,5));
        System.out.println("the sum of 2,3,4 and 5 is :" +sum(2,3,4,5));
        System.out.println("the sum of 1,2,3,4 and 5 is :" +sum(1,2,3,4,5));
    }
}
