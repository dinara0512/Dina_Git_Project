package top_20_Java_questions;

public class MinArray {
    public static void main(String[] args) {
        System.out.println(min(new int []{33,4,56,7,8}));
        System.out.println(min(new int []{336,4777,76,7,8777}));
    }
    public static int min (int[] arrNum){
        int min = arrNum[0];
        for (int num:arrNum){
            if (min>num){
                min=num;
            }
        }
        return min;
    }
}
