package com.company;

public class CWH_27_arrays {
    public static void main(String[]args){

//        float []marks={34.5f,45.0f,56.5f,67.0f,78.5f};
        int [] marks={34,45,56,67,78};
//        System.out.println(marks.length);
//        System.out.println(marks[2]);
//        String[] students={"Harry","intezar","atul","lovish"};
//        System.out.println(students.length);
//        System.out.println(students[3]);
        //Displaying the array (naive way)
//        System.out.println("Printing using naive way");
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);
        //Display the Array (FOR LOOP)
//        System.out.println("Printing using For loop");
//        for(int i=0; i<marks.length;i++){
//            System.out.println(marks[i]);
//        }
        //Quick Quiz:- Display the Array in reverse order (FOR LOOP)
        System.out.println("Printing using for loop in reverse order");
        String subject[]={"Mathematics","Science","English","Hindi"};
        for(int i=subject.length-1;i>=0;i--) {
            System.out.println(subject[i]);
        }
            //Displaying the array(for-each loop)
            System.out.println("Printing using for-each loop");
            for(int element:marks){
                System.out.println(element);
            }

    }
}
