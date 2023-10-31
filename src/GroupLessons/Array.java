package GroupLessons;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        int [] num1 = new int [3];
//        int []num2 ={1,2,3,4};
//        num1=num2;
//        for (int i = 0; i < num1.length ; i++) {
//            System.out.println(num1[i]);
//int []intArr ={15,30,45,60,75 };
//intArr[2] = intArr[4];
//intArr[4]=90;
//        System.out.println(Arrays.toString(intArr));


        //{5,0,8,0,10};
        // System.out.println(numbers);


        // CHAR ARRAY TO STRING
        char[] letters = {'a', 'b', 'c', 'd'};
        String s = new String(letters);
        System.out.println(s);
        System.out.println("=============");

        // STRING TO CHAR ARRAY
        String n = "java";
        char[] charArray = n.toCharArray();
        for (char each : charArray) {
            System.out.print(each + " ");
        }
        System.out.println("=============");

        String str = "Hello, World!";

        // Convert the string to a character array
        char[] charArray1 = str.toCharArray();

        // Iterate through the character array and print each character
        for (char c : charArray1) {
            System.out.print(c + " ");
        }

        //SPLIT
        String input = "java is fun";
        String[] arr = input.split(" ");
        for (String each : arr) {
            System.out.println(each);
        }

        //ARRAYS TO STRING
        int[] num = {1, 2, 3};
        System.out.println(Arrays.toString(num));

        //SORT
        int[] num1 = {2, 3, 5};
       Arrays.sort(num1);
       for (int each : num1) {
           System.out.print(each);
       }
        System.out.println("                ");

       // EQUALS
       int []a = {1,3,4,5} ;
       int [] b = {1,3,4,5};
        System.out.println(Arrays.equals(a,b));
        System.out.println("  ");
        String [] newArr ={"a", "b", "c"};
        System.out.println(String.join("<>",newArr));
        System.out.println(String.join("----",newArr));
    }
}

