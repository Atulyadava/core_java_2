package com.company;
class EkClass{
    int a;

    public int getA() {
        return a;
    }

    EkClass(int a){
      this.a=a;
    }

    public int returnOne(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int b,int c){
      super(c);
        System.out.println("I am a Constructor");
    }
}
public class CWH_47_this_super {
    public static void main(String[] args){
        EkClass e= new EkClass(65);
        System.out.println(e.getA());
        DoClass d= new DoClass(5,6);
    }
}
