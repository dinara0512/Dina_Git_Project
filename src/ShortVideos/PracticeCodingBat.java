package ShortVideos;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeCodingBat {

//    public String missingChar(String str, int n) {
//        String newWord = "";
//        int word = str.indexOf('n');
//        return str

    public static void main(String[] args) {
////parse method - convert String to primitive => return primitive
//        String str = "123";
//        int num1 = Integer.parseInt(str);
//        byte num2 = Byte.parseByte(str);
//        System.out.println("num2 = " + num2);
//        System.out.println("num1= " + num1);
////valueOf  - converting String to Wrapper class object => retun object
//        String str1= "35.5";
//        double str2 = Double.valueOf(str);
//        System.out.println("str2 " + str2);


//        ArrayList <Integer> numbers = new ArrayList<>();
//        numbers.add(10);
//        numbers.add(0,20);
//        numbers.remove(1);
//        System.out.println(numbers);

        Integer num1 = 10;
        System.out.println(num1);
        int num2=num1;
        System.out.println(num2);

        int num3 = 15;
        System.out.println(num3);
        Integer num4 = num3;
        System.out.println(num4);


    String str = "is it verdad?";
    Boolean str1 = Boolean.parseBoolean(str);
    Boolean str2 = Boolean.valueOf(str);
        System.out.println(str1);
        System.out.println(str2);

        String str3 = "155";
        Integer num = Integer.parseInt(str3);
        System.out.println(str3);
        String str5 = "555555";
        Integer str6 = Integer.valueOf(str5);
        System.out.println(str6);



        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,4,55,66,72,35,6));
        System.out.println(list);
        list.toArray();
        System.out.println(list);
        list.add(5);
        System.out.println(list);
        list.add(3,7778);
        System.out.println(list);
        System.out.println(list.contains(Integer.MAX_VALUE));
    }
}