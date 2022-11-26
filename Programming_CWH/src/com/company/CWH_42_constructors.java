package com.company;
class MyMainEmployee{
    private int id;
    private String name;
    private int salary;
    public MyMainEmployee(){//this is constructor
        id=45;
        name="atul_yadav";
    }
    public MyMainEmployee(String MyName,int MyId){//this is constructor
        id=MyId;
        name=MyName;
    }
    public MyMainEmployee(String MyName){//this is constructor
        id=4;
        name=MyName;
    }public MyMainEmployee(int MySalary){//this is constructor
        salary=MySalary;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
    public void setSalary(int s){
       this.salary=s;
    }
    public int getSalary(){
        return salary;
    }
}
public class CWH_42_constructors {
    public static void main (String[] args){
        MyMainEmployee harry=new MyMainEmployee("CodeWithHarry",12);
      //  MyMainEmployee harry=new MyMainEmployee();
       // MyMainEmployee harry=new MyMainEmployee("atul yadav");
        //MyMainEmployee harry=new MyMainEmployee(25000);
        //harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        //harry.setId(12);
        System.out.println(harry.getId());
        System.out.println(harry.getSalary());
    }
}
