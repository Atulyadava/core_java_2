package com.company;
import java.util.Scanner;
public class CWH_35_ps_ch7 {
    //problem..1
//    static void multiplication (int n){
//        System.out.println("enter the value of n :");
//
//        for(int i=1;i<=10;i++){
//            System.out.format("%d X %d = %d", n,i,(i*n));
//            System.out.println("");
//        }
//    }
//  public static void main(String[] args){
//     multiplication(8);
 // }


   // problem..2
//    static void pattern(int n){
//        for(int i=0; i<n; i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
//    }
//    public static void main(String[] args){
//        pattern(4);
//    }

    //problem..3
//    static int natural_number(int n) {
//        int sum = 0;
        //sum(n)=n+sum(n-1)
//        sum(5)=5+sum(4)
//        sum(5)=5+4+sum(3)
//        sum(5)=5+4+3+sum(2)
//        sum(5)=5+4+3+2+sum(1)
//        sum(5)=5+4+3+2+1
        // base condition
//        if (n == 1) {
//            return 1;
//        } else {
//            return n + natural_number(n - 1);
//        }
//    }
//    public static void main(String[] args){
//        int c=natural_number(5);
//        System.out.println(c);
//
//    }


    //problem..4
//    static void pattern(int n){
//       for(int i=0;i<n;i++) {
//           for(int j=i;j<n;j++){
//               System.out.print("* ");
//           }
//           System.out.println("");
//       }
//    }
//    public static void main(String[] args){
//     pattern(4);
//    }

    //problem..5
   // static int fibonacci_series(int n){
//      /*if(n==1)  {
//      return 0 ;
//      }
//     else if(n==2){
//          return 1;
//      }*/
//        if(n==1 || n==2){
//            return n-1;
//        }
//     else {
//         return fibonacci_series(n-1) + fibonacci_series(n-2);
//      }
//    }
//    public static void main(String[] args){
//       int result= fibonacci_series(7);
//       System.out.println(result);
//    }


    //problem..6
//    static float average(int...arr){
//        float sum=0;
//        for(int element: arr){
//            sum+=element;
//        }
//       return sum/arr.length;
//    }
//    public static void main(String[] args){
//        //int[] result={34,54,33,23,43,12};
//       System.out.println( average(23,45,565,54,32,82));
//
//    }

//    //problem..8
//    static void pattern(int n){
//       if(n>0){
//           pattern(n-1);
//           for(int i=0;i<n; i++){
//               System.out.print("* ");
//
//           }
//           System.out.println("");
//       }
//
//    }
//    public static void main(String[] args){
//        pattern(5);
//    }

    //problem..7
//    static void pattern(int n){
//        if(n>0){
//
//            for(int i=0;i<n; i++){
//                System.out.print("* ");
//            }
//            System.out.println("");
//            pattern(n-1);
//        }
//
//    }
//    public static void main(String[] args){
//        pattern(5);
//    }

    //problem..9//(0°C × 9/5) + 32 = 32°F
//    static void convert_temperature(float  celsius ){
//        float fahrenheit;
//       fahrenheit= ((celsius *9)/5)+32 ;
//        System.out.println(fahrenheit);
//    }
//    public static void main(String[] args){
//  convert_temperature(34);
//    }

    //problem..10
    static void natural_num(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    public static void main(String []args){
        natural_num(7);
    }


}

