package Other;

public class isPalindrome {
    /*
    1.boolean method
    2.start , end int
    3. while loop
    4.if condition
    5.return true
    6.return false

     */

    public static boolean isPalindrome (String str) {
        int start = 0;
        int end = str.length ()-1;

        while (start <end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("anna"));//true
        System.out.println(isPalindrome("computer"));//false
    }
}
