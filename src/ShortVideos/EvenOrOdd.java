package ShortVideos;

public class EvenOrOdd {
    //%
    //if condition
    // method

    public static void evenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        evenOrOdd(66);//even
        evenOrOdd(45);//odd
        evenOrOdd(450); //even
        evenOrOdd(745);//odd
        evenOrOdd(475);///odd
        evenOrOdd(4544);//even
    }

}