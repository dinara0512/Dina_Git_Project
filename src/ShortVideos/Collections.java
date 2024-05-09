package ShortVideos;

import java.util.ArrayList;
import java.util.Arrays;

public class Collections {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);



        System.out.println("Original Array List" + numbers);
        System.out.println("======================");
        java.util.Collections.shuffle(numbers);
        System.out.println("Shuffled list:" + numbers);
        System.out.println("======================");
        java.util.Collections.sort(numbers);
        System.out.println("Sorted list" + numbers);
        System.out.println("======================");
        java.util.Collections.max(numbers);
        System.out.println(java.util.Collections.max(numbers));
        System.out.println("======================");
        System.out.println(java.util.Collections.min(numbers));
        System.out.println("======================");
        java.util.Collections.swap(numbers,0,4);
        System.out.println(numbers);


    }
}
