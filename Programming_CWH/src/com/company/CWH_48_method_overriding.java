package com.company;


class A {
    public int a;
    public int harry(){
        return 4;
    }
    public void math2(){
        System.out.println("I am a method 2 of class A ");
    }
}
class B extends A {
    @Override
       public void math2(){
        System.out.println("I am a method 2 of class B ");
       }
       public void math3(){
        System.out.println("I am a method 3 of class B ");
       }
        }
public class CWH_48_method_overriding {
    public static void main(String[] args) {
     A a =new A();
     a.math2();

     B b = new B();
     b.math2();
     b.math3();

    }
}
