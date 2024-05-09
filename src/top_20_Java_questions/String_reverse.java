package top_20_Java_questions;

public class String_reverse {
    public static void main (String [] args){
        System.out.println(reverseStr("apple"));
        System.out.println(reverseStr("John"));
        System.out.println(reverseStr("phone"));
        System.out.println(reverseStr("1234567"));
        System.out.println("==============");
        System.out.println(revStr("apple"));
        System.out.println(revStr("John"));
        System.out.println(revStr("phone"));
        System.out.println(revStr("1234567"));
    }
 public static String reverseStr (String str) {
        String reverseWord = " ";
     for (int i = str.length()-1; i >=0; i--) {
         reverseWord = reverseWord + str.charAt(i);
         
     }
        return reverseWord;
 }

 public static String revStr (String str) {
     StringBuilder result = new StringBuilder();
     for (int i = str.length() - 1; i >= 0; i--) {
         result.append(str.charAt(i));
     }
    return result.toString();
 }
}
