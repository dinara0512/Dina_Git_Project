package top_20_Java_questions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] inputArr = new int [] {1,2,3,4,5};
        System.out.println(Arrays.toString(inputArr));
        reverseArray(inputArr);
        System.out.println(Arrays.toString(inputArr));
        String [] fruits = new String [] {"orange","apple","banana", "berry"};
        reverseArr(fruits);
        System.out.println(Arrays.toString(fruits));
    }
    public static void reverseArray (int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start <end) {
            int temporary = arr [start];
            arr [start]=arr [end];
            arr [end] = temporary;
            start++;
            end--;
        }
    }

    public static void reverseArr (String[] arr){
        int start1 = 0;
        int end1 = arr.length -1;
        while (start1 <end1) {
            String tempor = arr [start1];
            arr [start1]=arr [end1];
            arr [end1] = tempor;
            start1++;
            end1--;
        }
    }

}
