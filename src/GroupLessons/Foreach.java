package GroupLessons;

public class Foreach {
    public static void main(String[] args) {
        int [] nums = {30,12,150,12};
        for (int i = 0; i < nums.length ; i++) {
            System.out.println("Traditional fori loop: " + nums[i]);
            
        }
        System.out.println();
        for (int each: nums) {
            System.out.println("ForEach loop: " + each);
        }

        }


    }
