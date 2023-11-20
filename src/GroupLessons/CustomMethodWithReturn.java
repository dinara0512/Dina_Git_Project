package GroupLessons;

public class CustomMethodWithReturn {
    public static void main (String [] args) {
        String result = concatTwoString ("Loop", "Academy");
        System.out.println("result = " + result);
    }
    public static String concatTwoString (String first, String second) {
        return first +second;
    }
    public static int sum (int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;

    }

}
