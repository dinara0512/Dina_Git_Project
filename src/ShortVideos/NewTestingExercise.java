package ShortVideos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NewTestingExercise {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 10, 20, 1));
        list.add(35);
        System.out.println(list);
        System.out.println("================");
        list.removeLast();
        System.out.println(list);
        System.out.println("================");
        list.remove(list.size()-1);
        System.out.println(list);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        // System.out.println(list.size()-1);

        ArrayList <String> names = new ArrayList<>(Arrays.asList("Dina","Ramiz","Alina"));
        System.out.println(names);
        Collections.reverse(names);
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);



    }
}