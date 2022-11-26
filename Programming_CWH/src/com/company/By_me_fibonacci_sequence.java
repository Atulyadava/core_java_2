package com.company;

public class By_me_fibonacci_sequence {
    //through recursion
//    static int n1=0,n2=1,n,n3=0;
//    static void fibonacci_sequence(int n) {
//        if (n > 0) {
//            n3 = n1 + n2;
//            n1 = n2;
//            n2 = n3;
//            System.out.print(" " + n3);
//            fibonacci_sequence(n - 1);
//        }
//return ;
//    }
//
//            public static void main (String[]args){
//            int n = 10;
//            System.out.print(n1+" "+n2);
//                //System.out.println(fibonacci_sequence(x-2));
//                fibonacci_sequence(n - 2);
//        }

    public static void main(String[] args) {
        //through iterative
        int first_tearm = 0;
        int secound_tearm = 1;
        int next_tearm;
        int n = 10;
        System.out.print(first_tearm + " ," + secound_tearm+",");
        for (int i = 2; i < n; i++) {
            next_tearm = first_tearm + secound_tearm;
            first_tearm = secound_tearm;
            secound_tearm = next_tearm;
            System.out.print(next_tearm + " ,");
        }
    }
}