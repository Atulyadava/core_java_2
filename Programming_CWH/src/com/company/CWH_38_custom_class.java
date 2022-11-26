package com.company;
 class Employee1{
    int id ;
    String name;
    int salary;
    String post;
    public void printDetails(){
        //System.out.println("My id is "+ id);
       // System.out.println(" And My name is "+ name);
        //System.out.println("end your post is "+post);
       // System.out.println("end your salary is "+salary);
    }
    public int getSalary(){
        return salary;
    }
    public int id(){
        return id;
    }
    public String name(){
        return name;
    }
    public void getDetails(){
        System.out.println("end your post is "+post);
    }
}
public class CWH_38_custom_class {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee1 harry= new Employee1();// Instantiating a new Employee object
        Employee1 john= new Employee1();// Instantiating a new Employee object
        Employee1 atul= new Employee1();// Instantiating a new Employee object
        //setting Attributes for harry
        harry.id= 12;
        harry.name="CodeWitHarry";
        harry.salary=340000;
        harry.post="data analYst";

        //setting Attributes for john
        john.id=30;
        john.name="john parker";
        john.salary=20000;
        john.post="worker";

        //setting Attributes for atul
        atul.id=5;
        atul.name="atul yadav";
        atul.salary=100;
        atul.post = "software developer";
        //printing the attributes
        harry.printDetails();
        john.printDetails();
        atul.printDetails();
        int salary= john.getSalary();
        System.out.println(salary);
        int id= harry.id();
        System.out.println(id);
        String name =harry.name();
        System.out.println(name);
        harry.getDetails();
//        System.out.println(harry.id);
//        System.out.println(harry.name);
    }
    
}
