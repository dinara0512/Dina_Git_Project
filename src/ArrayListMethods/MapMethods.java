package ArrayListMethods;

import java.util.LinkedHashMap;


public class MapMethods {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        //        put( ) -------- > is put (Key, Value )
//                -Takes key and value arguments and stores the entry into the map
//                -if the key already exists in the map, it will update the value.
        //inserts key and value as a pair to the map
        map.put(11, "Neymar");
        map.put(7, "Ronaldo");
        map.put(8, "Kroos");
        map.put(23, "Umititi");
        map.put(4, "Fabrigas");
        System.out.println("map = " + map);

        //size (); return the size of the map (total number of pairs)
        System.out.println("size of map " + map.size());

//                get( index) -- > get (keyDataTypeValue)
//                -take the key and returns the value linked to that key.
//                -if trying to get a key that does not exist, it returns nul
        //returns the value of the given key from the map
        System.out.println(map.get(23));

        //replace (key,newValue); replace the value of the given key
        System.out.println(map.replace (11,"Ibrahimovic"));
        System.out.println(map);


//                remove( key)
//                -takes a key and removes the entry/pair that key is in related.
        System.out.println("========================");
        map.remove(11);
        System.out.println("map = " + map);
        System.out.println(map.size());
        System.out.println("========================");
//                containsKey ( key )
//                -will take the key and checks if it exist and return Boolean value
        System.out.println(map.containsKey(7));
//                containsValue (value )
//                -will take the value and checks if it exist and return Boolean value
//                -there might be couple same values, still returns true if there is any match
        System.out.println("========================");
        System.out.println(map.containsValue("Ronaldo"));//true
        System.out.println(map.containsValue("Dina"));//false

        //isEmpty (): check if the map is empty, returns boolean
        System.out.println(map.isEmpty()); // false

        //equals(MapObject); checks if 2 maps equal, returns boolean
        LinkedHashMap <Integer,String> map2 = new LinkedHashMap<>();
        map2.put(11, "Neymar");
        map2.put(7, "Ronaldo");
        map2.put(8, "Kroos");
        map2.put(23, "Umititi");
        System.out.println(map.equals(map2));//false

        //clear () removes all keys and values
        map.clear();
        System.out.println("map = " + map);




    }
}