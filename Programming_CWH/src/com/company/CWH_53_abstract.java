package com.company;

 abstract class parent2{
  public parent2(){
         System.out.println("mai parent22 ka constructor hun");
  }
  public void sayHello(){
      System.out.println("hello");
  }
  abstract public void greet();
  abstract public void greet2();
}
class child2 extends parent2{

     public void greet(){
         System.out.println("good morning");
     }
     public void greet2(){
         System.out.println("good Afternoon");
     }
     public void team(){
         System.out.println("i am a constructor of method team");
     }
}
abstract class child3 extends parent2 {
    public void team() {
        System.out.println("We are good");
    }
}
public class CWH_53_abstract {
    public static void main(String[] args){
     //   parent2 pp=new parent2(); // ---->Abstract class can not have a object.......


        child2 obj =new child2();
        obj.greet();
        obj.greet2();
        obj.team();
      // child3 ch3 = new child3(); //---->Abstract class dose not have a object.......
    }
}
