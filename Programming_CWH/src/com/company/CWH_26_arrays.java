package com.company;

public class CWH_26_arrays {
    public static void main(String[] args){
        /*classroom of 500 students - have to store marks ot these students
       you have two options:
        1. Create 500 variables
        2. use an array*/
        //there are three types way to create an array in java
        /*1.Declaration and  Memory Allocation!
       int[] marks=new int[5];*/
        //2.Declaration and then Memory allocation
//        int [] marks;//Declaration!
//        marks=new int[5];//Memory Allocation!
//        marks[0]=100;
//        marks[1]=70;
//        marks[2]=60;
//        marks[3]=90;
//        marks[4]=86;
        //3.Declaration,Memory Allocation and Initialization together
        int [] marks={23,34,45,56,67};
       // marks[5]=96; - throws an array
        System.out.println(marks[3]);

    }
}
