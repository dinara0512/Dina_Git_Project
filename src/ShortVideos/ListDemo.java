package ShortVideos;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List <Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(5,1,2,3,4));
        arrayList.addAll(Arrays.asList(5,1,2,3,4));

        List <Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(5,1,2,3,4));
        linkedList.addAll(Arrays.asList(5,1,2,3,4));

        List <Integer> vector = new Vector<>();
        vector.addAll(Arrays.asList(5,1,2,3,4));
        vector.addAll(Arrays.asList(5,1,2,3,4));

        List <Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(5,1,2,3,4));
        stack.addAll(Arrays.asList(5,1,2,3,4));

        System.out.println("arrayList = " + arrayList);
        System.out.println("linkedList = " + linkedList);
        System.out.println("vector = " + vector);
        System.out.println("stack = " + stack);

        System.out.println("=================================");
        System.out.println("ArrayList: " );
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));


        }
    }
}
