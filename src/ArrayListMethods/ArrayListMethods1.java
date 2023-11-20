package ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        //add element
        list.add("Monday");
        list.add("Tuesday");
        System.out.println(list);
        //size
        System.out.println(list.size());
        //get
        System.out.println(list.get(1));

        System.out.println(list);
        list.add("Wednesday");
        list.add("Thursday");
        //remove
        list.remove(3);
        System.out.println(list);
        list.add("Friday");
        list.remove("Friday");
        list.add("Friday1");
        //clear
        list.clear();
        System.out.println("list + " + list);

        list.add("Friday2");
        list.add("Saturday");
        list.add("Sunday");

        //set
        list.set(2,"Funday");
        System.out.println(list);



        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(2);// index 0
        nums.add(20); // index 1
        nums.add(200);
        nums.add(2);
        nums.add(2);
        nums.add(2000);
        nums.add(2000000);
        System.out.println("nums = " +nums);


        //indexOf
        int index1 = nums.indexOf(20);
        System.out.println(" index1 = " +index1);
        System.out.println(nums.indexOf(2));

        //lastIndexOf
        System.out.println(nums.lastIndexOf(2));


    }
}
