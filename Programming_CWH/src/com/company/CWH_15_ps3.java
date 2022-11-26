package com.company;

public class CWH_15_ps3 {
    public static void main(String[] args){
        //problem 1
        String name = "My name is Jack Parker";
//        name = name.toLowerCase();
//        System.out.println(name);
       // name =name.replace(' ','_');
       // System.out.println(name);

        //problem 3
        String letter = " Dear <|name|> ,thanks a lot";
        letter = letter.replace("<|name|>","Harry");
        System.out.println(letter);

        //problem 4
        String statement = "I am  not a   very rich person";
        System.out.println(statement.indexOf("  "));
        System.out.println(statement.indexOf("   "));

        //problem 5
        String myletter ="dear harry ,\n\t this java course is nice.\nthanks a lot";
        System.out.println(myletter);
    }
}
