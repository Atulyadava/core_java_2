package com.company;

class Base1{
     Base1(){
        System.out.println("I am a constructor ");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with th value of x as :" + x);
    }
    public int x;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived1 extends Base1{
    public int y;
   Derived1(){
       //super(0);//for Base1 class argument constructor call
       System.out.println("I AM A DERIVED CLASS CONSTRUCTOR");
   }
   Derived1(int x,int y){
       super(x);
       System.out.println("I am an overloaded constructor with the value of y as :" + y);
   }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("I am child of Derived constructor");
    }
    childOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am an overloaded constructor with the value of z as :" + z);
    }
}
public class CWH_46_constructors_in_Inheritance {
    public static void main(String[] args) {
        //Base1 b=new Base1();
       //b.setX(23);
       // System.out.println(b.getX());

        //Derived1 d=new Derived1();
       // d.setY(12);
       // d.setX(23);
       // System.out.println(d.getY());
       // System.out.println(d.getX());
        //childOfDerived cd=new childOfDerived();
        childOfDerived cd=new childOfDerived(12,13,15);
    }
}
