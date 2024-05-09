package top_20_Java_questions;

public class PrimeNumber {
/*
Prime number. A prime number is a number that can only be divided by itself and 1 without remainder.
 */
        public static void main(String[] args) {
            System.out.println(isPrime(29)); // true
            System.out.println(isPrime(35)); // false
            System.out.println(isPrime(20)); // false
            System.out.println(isPrime(27)); // false
            System.out.println(isPrime(7)); // true
        }

        /**
         *  A prime number is a number that can only be divided by itself and 1 without remainder.
         */
        public static boolean isPrime(int num) {
            // create numbers from 2 till half inclusive of the num
            for (int i = 2; i <= num / 2; i++) {
                // try each number by using %
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
