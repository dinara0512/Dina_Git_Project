package GroupLessons;

import java.util.Scanner;

public class ReplitLastArray {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter sums");
            int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

            //TODO Type your code below:
            for (int i = 0; i < nums.length; i++) {
                nums[i] = input.nextInt();
            }

            boolean similarNum = false;

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    similarNum = true;
                    break;
                }
            }

            System.out.println(similarNum);
        }
    }
