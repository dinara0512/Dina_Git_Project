package GroupLessons;

import java.util.Arrays;
import java.util.Scanner;

public class Replit {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        System.out.println("enter an array");
        String[] arr = new String[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = input.nextLine();
            System.out.println((arr[i]));

        }
    }
}
