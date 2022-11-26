package com.company;

public class CWH_32_method_overloading {
    static void foo(){
        System.out.println("Good  morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning "+a +" Bro!");
    }
    static void foo(int a,int b){
        System.out.println("Good morning "+a +" Bro!");
        System.out.println("Good morning "+b +" Bro!");
    }

   static void foo(String a,int b){

        System.out.println("Good morning " + a +" Bro!");
        System.out.println("Its your "+b +" rupees!");
    }
    static void change(int a)
    {
        a=98;
    }
    static void change2(int [] arr)
    {
        arr[0]=98;
    }
    static void telljoke()
    {
        System.out.println("I invented a new word!\n "+"plagiarism!");
    }
    public static void main(String[]args) {
        telljoke();
      //  case 1 : changing the integer
//        int []marks = {53,43,89,65,71};
//        int x=45;
//        change(x);
//         System.out.println("the value of x after running change is: "+x);
//        case 2 : changing the array
//        int []marks = {53,43,89,65,71};
//        change2(marks);
//       System.out.println("changing the value of arr[0] is: "+marks[0]);
//
//   Method overloading
        foo();
       foo( 3000);
        foo("rahul",4000);
        foo(4987,988);
        // Arguments are actual!
    }
}
