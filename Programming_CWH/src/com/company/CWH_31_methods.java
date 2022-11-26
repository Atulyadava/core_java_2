package com.company;

public class CWH_31_methods {
    static int logic(int x, int y) { //sab ka ek hi frezer
     //int logic(int x, int y) {  //sab k pass apna apna frezer
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        x=566;
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        //method invocation using object creation
        //CWH_31_methods obj=new CWH_31_methods();
        //c = obj.logic(a, b);
        c = logic(a, b);
        System.out.println(a+" "+b);
        int a1 = 3;
        int b1 = 2;
        int c1;
        //CWH_31_methods obj1=new CWH_31_methods();
        //c1 = obj1.logic(a1, b1);
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}