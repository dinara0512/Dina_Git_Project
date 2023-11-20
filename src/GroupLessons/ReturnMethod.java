package GroupLessons;

public class ReturnMethod {
    public static void main(String[] args) {
        System.out.println("message1");
        System.out.println(sum(1,2));
        System.out.println("message2");
    }
    public static int sum(int x, int y) {
        return x+y;
    }
}
