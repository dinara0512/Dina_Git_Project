package ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods1 {
//    public static void main(String[] args) {
//        ArrayList list = new ArrayList<>();
//        //add element
//        list.add("Monday");
//        list.add("Tuesday");
//        System.out.println(list);
//        //size
//        System.out.println(list.size());
//        //get
//        System.out.println(list.get(1));
//
//        System.out.println(list);
//        list.add("Wednesday");
//        list.add("Thursday");
//        //remove
//        list.remove(3);
//        System.out.println(list);
//        list.add("Friday");
//        list.remove("Friday");
//        list.add("Friday1");
//        //clear
//        list.clear();
//        System.out.println("list + " + list);
//
//        list.add("Friday2");
//        list.add("Saturday");
//        list.add("Sunday");
//
//        //set
//        list.set(2,"Funday");
//        System.out.println(list);
//
//
//
//        ArrayList <Integer> nums = new ArrayList<>();
//        nums.add(2);// index 0
//        nums.add(20); // index 1
//        nums.add(200);
//        nums.add(2);
//        nums.add(2);
//        nums.add(2000);
//        nums.add(2000000);
//        System.out.println("nums = " +nums);
//
//
//        //indexOf
//        int index1 = nums.indexOf(20);
//        System.out.println(" index1 = " +index1);
//        System.out.println(nums.indexOf(2));
//
//        //lastIndexOf
//        System.out.println(nums.lastIndexOf(2));
//
//
//    }
//}

/*Write a program to find the largest and second largest array? Smallest and second smallest in array?
    arr[] = {12, 13, 1, 10, 26, 48, 25, 34, 9}*/

public static void twoLargestArrays (int [] arr) {
int firstLargest = Integer.Min_value;
int secondLargest = Integer.Min_vlue;
    for (int num : arr) {
        if (num > firstLargest) {
            secondLargest = firstLargest;
            firstLargest = num;
        } else if (num > secondLargest && num != firstLargest) {
            secondLargest = num;
        }
    }

    public static void main (String [] args) {
        arr[] = {12, 13, 1, 10, 26, 48, 25, 34, 9};
        System.out.println(twoLargestArrays(arr));
    }

}
}
