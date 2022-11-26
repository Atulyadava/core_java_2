package com.company;
class base{
   public int x;

    public int getX() {

        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base And setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("i am a constructor");
    }
}
class Derived extends base{
  public int y;

    public int getY() {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }
}
class animal {
    public int livingAge;
    public String sense;

    public int getLivingAge() {
        return livingAge;
    }

    public void setLivingAge(int livingAge) {
        this.livingAge = livingAge;
    }

    public String getSense() {
        return sense;
    }

    public void setSense(String sense) {
        this.sense = sense;
    }
}
    class dog extends animal{
        public String barking;

        public String getBarking() {
            return barking;
        }

        public void setBarking(String barking) {
            this.barking = barking;
        }
    }
    class puppy extends dog{
        public String DrinkMilk;
        public String getDrinkMilk() {
            return DrinkMilk;
        }
        public void setDrinkMilk(String drinkMilk) {
            DrinkMilk = drinkMilk;
        }


    }

public class CWH_45_Inheritance {
    public static void main(String[] args) {
//        base b=new base();
//        b.setX(4);
//        System.out.println(b.getX());

//        Derived d=new Derived();
//        d.setY(12);
//        d.setX(5);
//        System.out.println(d.getY());
//        System.out.println(d.getX());
//
//        animal an=new animal();
//        an.setLivingAge(12);
//        an.setSense("by nose");
//        System.out.println(an.getLivingAge());
//        System.out.println(an.getSense());
////
//        dog dg =new dog();
//        dg.setLivingAge(12);
//        dg.setSense("by nose");
//        dg.setBarking("bhau bhau bhau...");
//        System.out.println(dg.getLivingAge());
//        System.out.println(dg.getSense());
//        System.out.println(dg.getBarking());

        //TRY BY MAIN
//        puppy p = new puppy();
//        p.setLivingAge(12);
//        System.out.println(p.getLivingAge());
//        p.setBarking("ghuau ghuau....");
//        System.out.println(p.getBarking());
   }
}
