package com.company;
class circle2{
     public float radius;
     circle2(){
         System.out.println("I am non param constructor");
     }
     circle2(int r){
         System.out.println("i am a circle parameterized constructor");
        this.radius=r;
       //  System.out.println("radius is "+ this.radius);
     }
    public void areaOfCircle2(){
        float area= (float) Math.PI*this.radius*this.radius;
        System.out.println("area of circle is "+ area);
        //return area;
    }
}
class cylinder1 extends circle2{
    public int height;
    cylinder1(int r,int h){
        super(r);
        System.out.println("I am a cylinder1 parameterized constructor");
     this.height=h;
        //System.out.println("Height of  the cylinder is " + this.height);
    }
    public float surfaceAreaOfCylinder(){
        float surfaceAreaOfCylinder= (float) ((float) 2*Math.PI*this.radius*this.height +  2*Math.PI*radius*radius);
        System.out.println("Surface Area of Cylinder is "+surfaceAreaOfCylinder);
        return surfaceAreaOfCylinder;
    }
    public double volumeOfCylinder(){
        double volume=(22/7f)*radius*radius*height;
        System.out.println("volume of cylinder is :"+volume);
        return volume ;
    }
}
class rectangle1{
    public int length;
    public int wirth;
    rectangle1(){
        System.out.println("I am non param constructor");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWirth() {
        return wirth;
    }

    public void setWirth(int wirth) {
        this.wirth = wirth;
    }

    rectangle1(int l, int w){
       System.out.println("i am a rectangle parameterized constructor");
       this.length=l;
       this.wirth=w;
   }
   public double areaOfRectangle(){
        double area=length*wirth;
       System.out.println("area of rectangle is : "+area);
       return area  ;
   }
}
class cuboid extends rectangle1{
    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    cuboid(int l, int w, int h){
        super(l,w);
        System.out.println("i am a cuboid parameterized constructor");
        this.height=h;
    }
  public double areaOfCuboid(){
        double area=(2*length*wirth)+2*wirth*height+2*length*height;
      System.out.println(" area of cuboid is : "+area);
        return area;
  }
  public double volumeOfCuboid(){
        double volume =length*wirth*height;
      System.out.println("volume of cuboid is : "+volume);
      return volume;
  }
}
public class CWH_52_ps_ch10 {
    public static void main(String[] args) {
        // problem..1
         //circle2 cl=new circle2(8);
        // cl.areaOfCircle2();
         //cylinder1 cyl= new cylinder1(5,4);
         //cyl.surfaceAreaOfCylinder();
        // cyl.volumeOfCylinder();
        rectangle1 ret=new rectangle1(4,5);
        ret.areaOfRectangle();
        cuboid qbid =new cuboid(3,32,34);
         qbid.areaOfCuboid();
         qbid.volumeOfCuboid();
    }
}
