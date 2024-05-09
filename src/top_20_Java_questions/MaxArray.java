package top_20_Java_questions;

public class MaxArray {

    public static void main(String[] args) {
        System.out.println(max(new int[]{3,6,7,7,89}));
        System.out.println(max(new int[]{77,67,75,7444,89}));
        System.out.println(max(new int[]{3,6,7,7777,899}));
    }
    public static int max (int[] arrNum){
        int max = arrNum[0];
        for (int num:arrNum){
            if (max<num){
                max=num;
            }
        }
        return max;
    }
}
