package ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 1, 1, 2, 4, 5, 6, 7, 7));
        //any number less than 5
//        for (int i = 0; i < nums.size()-1; i++) {
//            if (i < 5) {
//                nums.remove(i);
//            }
//        }
        System.out.println("nums = " + nums);
        nums.removeIf(p -> p < 5);
        System.out.println("nums = " + nums);

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "JavaScript", "C++", "C#", "Junit", "Typescript"));
names.removeIf(s -> s.startsWith("J"));
        System.out.println("names = " + names);

    }
}