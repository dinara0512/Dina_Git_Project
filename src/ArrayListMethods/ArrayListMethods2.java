package ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
        System.out.println(" months = " + months);
        //contains
        boolean b1 = months.contains("January");
        boolean b2 = months.contains("loop");
        System.out.println("b1 " + b1);
        System.out.println("b2 " + b2);

        //isEmpty
        boolean b3 = months.isEmpty();
        System.out.println("b4 " + b3);

        //containsAll
        months.containsAll(Arrays.asList("January", "February"));
        //addAll
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(10, 20, 30, 30, 40));
        System.out.println("nums " + nums);
        //removeall
        nums.removeAll(Arrays.asList(10, 30, 40));
        System.out.println("nums " + nums);
        //retainALl
        nums.retainAll(Arrays.asList(30, 40));
        System.out.println("nums after retainall " + nums);
    }
}