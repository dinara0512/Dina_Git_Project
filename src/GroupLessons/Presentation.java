package GroupLessons;

public class Presentation {
    //method
    //for loop

    public static boolean primeNum (int num) {
        for (int i = 2; i <num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
         return true;
        }

    public static void main(String[] args) {
        System.out.println(primeNum(35));
        System.out.println(primeNum(24));
        System.out.println(primeNum(6));
        System.out.println(primeNum(29));
    }
    }




