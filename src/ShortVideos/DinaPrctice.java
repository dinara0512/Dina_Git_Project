package ShortVideos;

public class DinaPrctice {

    public static void evenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");

        }
    }

    public static void main(String[] args) {
        evenOrOdd(5);//odd
        evenOrOdd(8);//even
        evenOrOdd(100);//even
    }
}