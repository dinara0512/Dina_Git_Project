package ShortVideos;

import java.util.Arrays;

public class PracticeArray {
    public static void main(String[] args) {


        int[] num = {1, 0, 3, 43, 99};
        //0,1,2,3,4//index
        int[][] num1 = {{1, 0, 3, 43, 99},
                {22, 55, 6, 77, 88}};
        System.out.println(Arrays.toString(num));
        System.out.println("============");
        System.out.println((num1[0][2]));

        String [] cars = {"BMW","Mercedes", "Ford"};
        for (String car :cars) {
            System.out.println(car);
        }
        System.out.println("============");
        for (int i = 0; i < cars.length ; i++) {
            System.out.println(cars[i]);


        }
        }


        }




