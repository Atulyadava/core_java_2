package com.company;

class MyEmployee{
   private int id;
   private String name;
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
}
class circle1{
    private int radius;
    private float area1;
    private float perimeter;
    public void setRadius(int r){
        this.radius=r;
    }
    public int getRadius(){
        return radius;
    }
    public void setArea1(int r){
        this.area1=(22/7f)*r*r;
    }
    public float getArea1(){
        return area1;
    }

    public void setPerimeter(int r){
        this.perimeter=2*(22/7f)*r;
    }
    public float getPerimeter(){
        return perimeter;
    }

}
public class CWH_40_ch9 {
    public static void main(String[] args) {
//    MyEmployee Harry=new MyEmployee();
//   // Harry.id=12;
//   //Harry.name="CodeWithHarry";-->Through an error dou to access modifier
//        Harry.setId(12);
//        System.out.println(Harry.getId());
//        Harry.setName("CodeWithHarry");
//        System.out.println(Harry.getName());
        circle1 c=new circle1();
        c.setRadius(12);
        System.out.println(c.getRadius());
        c.setPerimeter(12);
        System.out.println("perimeter of circle is "+c.getPerimeter());
        c.setArea1(12);
        System.out.println("area of circle is "+c.getArea1());

    }

}
