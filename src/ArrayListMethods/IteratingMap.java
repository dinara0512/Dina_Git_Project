package ArrayListMethods;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMap {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(11, "Neymar");
        map.put(7, "Ronaldo");
        map.put(8, "Kroos");
        map.put(23, "Umititi");
        map.put(4, "Fabrigas");
        System.out.println("map = " + map);


//        Lopping through Map:
//        -We cannot loop directly in the map
//        -We can use keyset method to iterate through the Set of Keys and by using get method
//        we will be able to get every value as well.
//        keySet ( )
//                -will return us a set of the keys. Since it is Set, we can use foreach to loop
        for (Integer each : map.keySet()) {
            System.out.println(each);
        }
        System.out.println("==================================");

//                .values( )
//                -returns the Collection of Values in the map
    for (String str :map.values()) {
        System.out.println(str);
    }  System.out.println("==================================");

//                .entrySet()
//                -returns the entries in the map

        for (Map.Entry <Integer, String> eachEntry : map.entrySet() ) {
            System.out.println(eachEntry);
        }

//                .getKey()
//                .getValue()

    }
}
