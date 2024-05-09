package ArrayListMethods;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
         //hashset does not maintain the order
        //hashset accepts null value

        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(10,40,56,2));
        hashSet.add(null);


        //linked hashset maintain the order
       //linked hashset accepts null value
        Set <Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10,40,56,2));
        linkedHashSet.add(null);

        //treeset returns descneding order from the smallest to the largest
        // treeset does not accepts null value
        Set <Integer> treeset = new TreeSet<>();
        treeset.addAll(Arrays.asList(10,40,56,2));
        //treeset.add(null); throws null point exception

        System.out.println("hashSet = " + hashSet);
        System.out.println("linkedhashSet = " + linkedHashSet);
        System.out.println("treeset = " + treeset);
        System.out.println("=======================");


    }
}