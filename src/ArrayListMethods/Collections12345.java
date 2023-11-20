package ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections12345 {
    public static void main(String[] args) {
        ArrayList <Integer> nums =new ArrayList<>();
        nums.addAll(Arrays.asList(10,50,50,602,100,200));
        System.out.println("nums = " + nums);

        java.util.Collections.sort(nums);
        System.out.println("nums = " +nums);
        System.out.println("===================");

        Integer max = java.util.Collections.max(nums);
        Integer min = Collections.min (nums);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("===================");
        java.util.Collections.reverse(nums);
        System.out.println("nums = " + nums);
        System.out.println("===================");
        java.util.Collections.swap(nums, 1,2);
        System.out.println("nums= " + nums);

        System.out.println("===================");

        int howMany = java.util.Collections.frequency(nums,50);
        System.out.println("nums = " + howMany);

    }
}
