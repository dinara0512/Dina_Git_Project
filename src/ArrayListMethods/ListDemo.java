package ArrayListMethods;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
//order is preserved and duplicates are allowed
        //does not accept primitive data, only object

        List<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(5, 1, 2, 3, 4));
        arrayList.addAll(Arrays.asList(5, 1, 2, 3, 4));

        List<Integer> lindkedList = new LinkedList<>();
        lindkedList.addAll(Arrays.asList(5, 1, 2, 3, 4));
        lindkedList.addAll(Arrays.asList(5, 1, 2, 3, 4));

        List<Integer> vector = new Vector<>();
        vector.addAll(Arrays.asList(1, 2, 3, 4,5));
        vector.addAll(Arrays.asList(1, 2, 3, 4,5));

        List<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList( 1, 2, 3, 4,5));
      // stack.addAll(Arrays.asList(5, 1, 2, 3, 4));

        System.out.println("arrayList " +arrayList);
        System.out.println("linkedList " +lindkedList);
        System.out.println("vector " + vector);
        System.out.println("stack " + stack);

        System.out.println("============================");
        System.out.println("Arraylist:");
        for (int i = 0; i <arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("============================");
        for (Integer each:arrayList) {
            System.out.println(each);

        }


        System.out.println("============================");
        System.out.println("Stack:");
        for (int i = 0; i <stack.size(); i++) {
            System.out.println(stack.get(i));
        }
        System.out.println("============================");
        System.out.println("stack");
        ((Stack)stack).pop();//casting
        System.out.println(stack);//after pop method 5 is removed First in last out method


    }
}