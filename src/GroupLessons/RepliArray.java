package GroupLessons;

import java.util.Scanner;

public class RepliArray {
    public static void main(String[] args) {
        int[] num = {34, 59, 19};
        for (int each : num) {
            System.out.println("First element: " +
                    each + "\nMiddle element: " + each + "\nLast element: " + each);
        }


        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        // leave above code alone
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below
        for (String word : words) {
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length() - 1);
            System.out.println(firstChar + " " + lastChar);
        }


        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = scan.nextInt();
        }

        //WRITE YOUR CODE BELOW
        int[] nums1 = new int[6];
        for (int i = 0; i < nums.length; i++) {
            nums1[i] = nums[i];
        }
        for (int i = 0; i < 6; i++)
            System.out.println("Element " + (i + 1) + ": " + nums1[i]);
        System.out.println(nums1);

    }
}

