package com.company;
class Phone{
    public void ShowTime(){
        System.out.println("time is 8:00 pm ");
    }
    public void on(){
        System.out.println("Turning on Phone.... ");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music..");
    }
    public void on(){
        System.out.println("Turning on SmartPhone..... ");
    }
}
public class CWH_49_DYNAMIC_method_dispatch {
    public static void main(String[] args) {
//     Phone obj =new Phone();//ALLOWED
//     obj.greet();
//     obj.name();
//     SmartPhone obl2=new SmartPhone();//YES IT IS ALLOWED
        Phone obj= new SmartPhone();//ALLOWED
       //***** SmartPhone obj2= new Phone();*****//Not allowed
       obj.ShowTime();
        obj.on();
       // obj.music();//not Allowed

    }
}
