package ShortVideos;

public class TryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(9 / 0);
            System.out.println("try block");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Catch block");
        } finally {
            System.out.println("Finally block");
        }
        System.out.println("Loop Academy");
    }
}