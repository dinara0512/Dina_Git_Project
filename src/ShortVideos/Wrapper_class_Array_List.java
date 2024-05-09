package ShortVideos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Wrapper_class_Array_List {
    public static void main(String[] args) {
        int num = 3;
        Integer num1 = num;
        System.out.println(num1);

        char letter1 = 'K';
        int num5 = 6;
        Integer num9 = Integer.valueOf(num5);
        System.out.println(num9);
        Character letterFinal = Character.valueOf(letter1);
        System.out.println(letterFinal);
        System.out.println("------------------------------------");
        Integer num2 = 4;
       // int num3 = int.Valueof(); // second way of un-boxing, by using the method; method ValueOf convert to the primitive data type (int); instance method - needs the object in order to call it
       // System.out.println(num3);
        System.out.println("------------------------------------");

         String str = "Today is Wednesday";
         boolean numConvert = Boolean.parseBoolean(str);
         //int numConvert = Integer.parseInt(str);
         System.out.println(numConvert);
        System.out.println("------------------------------------");
        ArrayList <String> list = new ArrayList<>(Arrays.asList("banana", "apple", "kiwi", "mango", "cherry"));
        list.remove("kiwi");
        System.out.println(list);
        System.out.println("------------------------------------");
        list.set(1,"peach");
        System.out.println(list);
        System.out.println("------------------------------------");
       ///list.removeAll(list);
        //System.out.println(list);
        System.out.println(list.size());

        for (int i = 0; i <list.size(); i++) {
            System.out.println(i);
        }

            System.out.println(Collections.max(list));
           Collections.reverse(list);
           System.out.println(list);
        }

}
