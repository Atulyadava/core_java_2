package com.company;
class cylinder{
    private int radius;
    private int height;

    public cylinder(int radius,int height) {
        this.radius = radius;
        this.height=height;
    }

    public void setRadius(int radius){
        this.radius=radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public int getHeight(){
        return height;
    }

    public float volume(){
        return (22/7f)*radius*radius*height;
    }
    public float Surface_Area(){
        return (2*(22/7f)*radius*height)+(2*(22/7f)*radius*radius);
    }
}
class myRectangle{
    private int length;
    private int wirth;

    public myRectangle(int length, int wirth) {
        this.length = length;
        this.wirth = wirth;
    }

    public myRectangle() {
        this.length = 4;
        this.wirth = 5;
    }

    public int getLength() {
        return length;
    }

    public int getWirth() {
        return wirth;
    }
}
class sphere{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public float getSurfaceArea(){
        return 4*(22/7f)*radius*radius;
    }
    public float getVolumeOfSphere(){
        return (4/3f)*(22/7f)*radius*radius*radius;
    }
}
public class CWH_44_ps_ch9 {
    public static void main(String[] args) {
//        cylinder cyl = new cylinder(12,8);
//       // cyl.setRadius(15);
//        System.out.println("radius of the cylinder is "+cyl.getRadius());
//       // cyl.setHeight(8);
//        System.out.println("height if the cylinder is "+cyl.getHeight());
//       //problem..2
//        cyl.volume();
//        System.out.println("then volume of this cylinder is "+cyl.volume());
//        System.out.println("surface area of this cylinder is "+cyl.Surface_Area());
//        //problem..4
//        myRectangle rect=new myRectangle();
//        System.out.println(rect.getLength());
//        System.out.println(rect.getWirth());
//
//        //problem..5
        sphere s=new sphere();
        s.setRadius(23);
        System.out.println(s.getRadius());
        System.out.println(s.getSurfaceArea());
        System.out.println(s.getVolumeOfSphere());
    }
}