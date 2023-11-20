package GroupLessons;

import java.util.Scanner;

public class examples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter nums");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int iterate = input.nextInt();
        int total =0;
        for (int i = 0; i < iterate; i++) {
            if (i % 3 == 0) continue;
            total += num1 + num2;
        }
        System.out.println(total);
        }
        }
