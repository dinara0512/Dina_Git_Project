package ArrayListMethods;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        //hashmap gives random order
        //accepts null as a key
        Map <Integer, String> hashMap = new HashMap<>();
        hashMap.put(11,"Neymar");
        hashMap.put(7,"Ronaldo");
        hashMap.put(8,"Kroos");
        hashMap.put(23,"Umititi");
        hashMap.put(4,"Fabrigas");
        hashMap.put(null,null);

        System.out.println("hashmap = " + hashMap);


        //linkedhashMap maintains order
        //accepts null as a key
        Map <Integer, String> linkedhashMap = new LinkedHashMap<>();
        linkedhashMap.put(11,"Neymar");
        linkedhashMap.put(7,"Ronaldo");
        linkedhashMap.put(8,"Kroos");
        linkedhashMap.put(23,"Umititi");
        linkedhashMap.put(4,"Fabrigas");
        hashMap.put(null,null);
        System.out.println("linkedhashMap = " + linkedhashMap);


//gives random order
        //does not accept null as a key
        //synchronized
        Map <Integer, String> hashTable = new Hashtable<>();
       hashTable.put(11,"Neymar");
        hashTable.put(7,"Ronaldo");
        hashTable.put(8,"Kroos");
       hashTable.put(23,"Umititi");
       hashTable.put(4,"Fabrigas");
        System.out.println("hashtable " + hashTable);



        //maintains sorted key order
        //does not accept null as a key
        Map <Integer, String> treeMap = new TreeMap<>();
       treeMap.put(11,"Neymar");
       treeMap.put(7,"Ronaldo");
      treeMap.put(8,"Kroos");
        treeMap.put(23,"Umititi");
        treeMap.put(4,"Fabrigas");

        System.out.println("treemap = " +treeMap);

    }
}
