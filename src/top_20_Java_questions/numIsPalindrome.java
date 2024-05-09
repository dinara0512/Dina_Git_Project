package top_20_Java_questions;

public class numIsPalindrome {
    public static boolean isPalindrome (int num){
        int copyOfOriginal=num;
        int reversedNum=0;
        int remainder;
        while (num>0){
            remainder = num %10;
            reversedNum = (reversedNum*10)+remainder;
            num=num/10;
        }
        return reversedNum==copyOfOriginal;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1331));//true
        System.out.println(isPalindrome(225522));//true
        System.out.println(isPalindrome(77777777));//true
        System.out.println(isPalindrome(012345));//false
    }
}
