package ArrayListMethods;

import java.util.ArrayList;

public class ItteratingArrayListwithForEachLoop {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);//index 0 - element 1
        nums.add(20);//index 1 - element 2
        nums.add(30);//index 2 - element 3
        nums.add(40);//index 3 - element 4
        nums.add(50);//index 4 - element 5
        nums.add(60);//index 5 - element 6
        for (Integer each: nums) {
            System.out.println(each);
        }
        System.out.println("=====================");
        for (Integer num : nums) {
            System.out.println(num);

        }
        }
    }
