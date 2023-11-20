package ArrayListMethods;

import java.util.ArrayList;

public class ItteratingArrayListWithForLoop {
    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(10);//index 0 - element 1
        nums.add(20);//index 1 - element 2
        nums.add(30);//index 2 - element 3
        nums.add(40);//index 3 - element 4
        nums.add(50);//index 4 - element 5
        nums.add(60);//index 5 - element 6
        for (int i = 0; i <nums.size() ; i++) {
            System.out.println(nums.get(i));
        }
        System.out.println("=========================");
        for (int i = nums.size()-1; i >=0 ; i--) { //-1 because calculates index but theres 6 elements
            System.out.println(nums.get(i));
        }
            System.out.println("=========================");
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        for (int i = nums.size() - 1; i >= 0; i--) {
            System.out.println(nums.get(i));
        }

            }


        }

