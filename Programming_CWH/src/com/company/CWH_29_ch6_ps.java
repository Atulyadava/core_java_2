package com.company;
import javax.swing.*;
import java.util.Scanner;
public class CWH_29_ch6_ps {
    public static void main(String[] args) {
        //practice problem.1
        //BY ATUL
//        System.out.println("enter the number of elements in this array ");
//        Scanner sc =new Scanner(System.in);
//        int n=sc.nextInt();
//        float []array= new float[n];
//        float sum=0;
//        for(int i=0; i<n; i++) {
//            System.out.println("enter the value of element " + i);
//           float elements=sc.nextFloat();
//            sum = sum + elements;
//        }
//            System.out.println(sum);

//        float[]marks={34.5f,56.6f,67.5f,677.5f,56.7f};
//        float sum=0;
//        for(float element:marks){
//            sum=sum+element;
//        }
//        System.out.println("the value of sum is: "+sum);


        //practice problem..2
//        int[] marks = {34, 47, 45, 67, 78, 90, 23};
//        int num = 47;
//        boolean isInArray = false;
//        for (int element : marks) {
//            if (num == element) {
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray) {
//            System.out.println("num is present in the Array");
//        }
//        else {
//            System.out.println("num is not in the Array");
//        }

//        //practice problem.3
//        float sum=0;
//        float average;
//        float [] physics={34,56,67,57,38};
//        for(float element:physics){
//            sum = (sum + element);
//        }
//        System.out.println("total marks of all students in physics"+sum);
//        average=sum/physics.length;
//        System.out.println("average of all students marks in physics "+average);

       // practice problem.4
//        int[][] matrices1 = {{1, 2, 3},
//                {4, 5, 6}};
//        int[][] matrices2 = {{2, 6, 13},
//                {3, 7, 1}};
//        int[][] result = {{0, 0, 0},
//                {0, 0, 0}};
//
//        for (int i = 0; i < matrices1.length; i++) { //row number of time
//            for (int j = 0; j < matrices1[i].length; j++) { //colum number of time
//                System.out.format("setting value for i=%d and j=%d\n", i, j);
//                result[i][j] = matrices1[i][j] + matrices2[i][j];
//            }
//        }
//        //printing the element of 2-D array
//        for (int i = 0; i < matrices1.length; i++) {
//            for (int j = 0; j < matrices1[i].length; j++) {
//                System.out.print(result[i][j]+" ");
//                result[i][j] = matrices1[i][j] + matrices2[i][j];
//            }
//            System.out.println("");
//        }

        //practice problem.5
//        //by  ATUL
//        int []array={12,23,34,45,56,24,23,45,78,90,87};
//        for(int i=array.length-1; i>=0;i--){
//                System.out.print(array[i]);
//                System.out.print(" ");
//            }

//       int [] arr={23,54,56,67,65,75,86,2};
//       int l=arr.length;
//       int temp;
//      int n=Math.floorDiv(l, 2);
//      for(int i=0; i<n;i++){
//         temp=arr[i];
//         arr[i]=arr[l-i-1];
//         arr[l-i-1]=temp;
//      }
//      for(int element: arr){
//          System.out.print(element+" ");
//      }


        //practice problem.6
//        int[] arr = {21, 34, 56, 67, 85, 781, 58, 67, 97, 87, 98, 34};
//        int max = Integer.MIN_VALUE;
//        int l = arr.length;
//            for (int element : arr) {
//                if (element > max) {
//                    max = element;
//                }
//        }
//        System.out.println(max);


        //practice problem.7
//        int[] arr = {21, 34, 56, 67, 85, 781, 58, 67, 97, 87, 98, 34};
//        int min =Integer.MAX_VALUE;
//        int l = arr.length;
//            for (int element : arr) {
//                if (element < min) {
//                    min = element;
//                }
//        }
//        System.out.println(min);

//        //practice problem.8
//        boolean isSorted= true;
//        int[] arr = {23, 4, 56, 75, 94, 39, 12};
//        int l = arr.length;
//
//            for(int i = 0; i < l-1; i++) {
//                if (arr[i] > arr[i + 1]) {
//                   isSorted=false;
//                   break;
//                }
//            }
//            if(isSorted)
//        System.out.println("this array is sorted");
//            else
//                System.out.println("this array is not sorted");
    }
}
