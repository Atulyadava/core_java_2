package com.company;
class Employee{
  int salary;
  String name;

  public int getSalary(){
  return salary;
  }
  public String gatName(){
      return name;
  }
  public void setName(String n){
      name =n;
  }
}
class CellPhone{

    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }
    public void callFriend(){
        System.out.println("calling intezar...");
    }
    public void camera(){
        System.out.println("camera...");
    }
}
class Square{
    int side;

//    public int getSide() {
//        return side;
//    }
//
//    public void setSide(int side) {
//        this.side = side;
//    }

    public int area(){
       return side*side;
    }
    public int perimeter(){
       return 4*side;
    }
}
class rectangle{
        int length;
        int wirth;
        public int area(){
            return length*wirth;
        }
        public int perimeter(){
            return 2*(length+wirth);
        }

    }
class Tommy{

    public void hit(){
        System.out.println("Hitting the Enemy");
    }
    public void run(){
        System.out.println("running from the Enemy");
    }
    public void fire(){
        System.out.println("firing on the enemy");
    }

}
class circle{
    int radius;
    public float area(){
        return (22/7)*radius *radius;
    }
    public float perimeter(){
       return  2*(22/7)*radius;
    }
}

public class CWH_39_ch8_ps {
    public static void main(String [] args){
//        //problem..1
//        Employee atul=new Employee();
//        atul.setName("CodeWithHarry");
//        atul.salary=100;
//        System.out.println(atul.getSalary());
//        System.out.println(atul.gatName());
//
//        //problem..2
//        CellPhone asus= new CellPhone();
//        asus.ring();
//        asus.vibrate();
//        asus.callFriend();
//        asus.camera();
//
//        //problem..3
        Square sq =new Square();
        sq.side=12;
        ////sq.setSide(12);
        ////System.out.println(sq.getSide());
        //System.out.println("area of square is "+sq.area());
       // System.out.println("perimeter of square is "+sq.perimeter());
//
//        //problem..4
//        rectangle rtg= new rectangle();
//        rtg.length=12;
//        rtg.wirth=23;
//        System.out.println("area of rectangle is "+rtg.area());
//        System.out.println("perimeter of rectangle "+rtg.perimeter());

//        //problem..5
//        Tommy player=new Tommy();
//        player.hit();
//        player.run();
//        player.fire();


        //problem..6
        circle cr= new circle();
        cr.radius=6;
        System.out.println("area of circle is "+cr.area());
        System.out.println("perimeter of circle is "+cr.perimeter());
    }
}
