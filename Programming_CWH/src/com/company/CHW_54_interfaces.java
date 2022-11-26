package com.company;

interface Bicycle{
    int a= 45;
    void applyBrake( int decrement);
    void speedUp(int increment);
}interface HornBicycle{
    void BlowHornK3g();
    void BlowHornMhn();
}
class AronCycle implements Bicycle , HornBicycle {

    public void applyBrake( int decrement){
        System.out.println("Apply Brake");
    }
    public void speedUp(int decrement){
        System.out.println("SpeedUp");
    }
    void blowHorn(){
        System.out.println("Pee Pee Pee.....");
    }
    public void BlowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    public void BlowHornMhn(){
        System.out.println("Mai hun naa po po po po");
    }
}

public class CHW_54_interfaces {
    public static void main(String [] args){
     AronCycle cycleHarry = new AronCycle();
     cycleHarry.applyBrake(2);
     // you can create properties in Interfaces
        System.out.println(cycleHarry.a);
        // **  you cannot modify properties in Interface as they are final
       // cycleHarry.a=45;
       // System.out.println(cycleHarry.a);
        cycleHarry.BlowHornK3g();
        cycleHarry.BlowHornMhn();
    }
}

