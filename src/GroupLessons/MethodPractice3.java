package GroupLessons;

import java.util.Scanner;

public class MethodPractice3 {
    /*
        create a method that will accept a number. Find and print if it is a
		positive number, negative number, or zero

int me
     */
    public static void findNum() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        int i = input.nextInt();

            if (i > 0) {
                System.out.print("The number is positive: " + i);
            }else if (i < 0) {
                System.out.print("The number is negative: " + i);
            }else if (i == 0) {
                System.out.print("The number is zero: " + i);
                    }
                }
            public static void main (String[]args) {
                findNum();
                System.out.println();
            }
        }
