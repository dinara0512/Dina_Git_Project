package top_20_Java_questions;

import java.util.Arrays;

public class Practice_top20 {
    public static void main(String[] args) {
        System.out.println(isPrime(9));   //false
        System.out.println(isPrime(99));   //false
        System.out.println(isPrime(3));   //true
        System.out.println(revWords("Everything is good."));
        System.out.println(isPalindrome("anna"));//true
        System.out.println(isPalindrome("level"));//true
        System.out.println(isPalindrome("bob"));//true
        System.out.println(isPalindrome("dina"));//false
        System.out.println(numIsPalindrome(12345));//false
        System.out.println(numIsPalindrome(779977));//true
    }

public static boolean isPrime (int nums) {
    for (int i = 2; i <= nums / 2; i++) {
        if (nums % i == 0) {
            return false;
        }
    }
    return true;
}
public static  String revWords (String str){
        StringBuilder res = new StringBuilder();
        String [] words = str.split("");
        for (int i=words.length-1;i>=0;i--){
            res.append(words[i]).append("");
        }
        return res.toString().trim();
    }

    public static boolean isPalindrome (String str) {
        int start = 0;
        int end = str.length()-1;
        while (start <end){
            if (str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end --;
        }
        return true;
    }

    public static boolean numIsPalindrome (int num){
        int copyOfOriginal = num;
        int reverseNum =0;
        int remainder;
        while (num>0){
            remainder=num%10;
            reverseNum=(reverseNum*10)+remainder;
            num=num/10;
        }
        return reverseNum==copyOfOriginal;
    }
}