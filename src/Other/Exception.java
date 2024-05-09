package Other;

public class Exception {
    public static void main(String[] args) {
        System.out.println(reverseStr("apple"));
        System.out.println(revStr("12345"));
    }

    public static String reverseStr (String str) {
        StringBuilder result= new StringBuilder();
        for (int i=str.length()-1;i>=0;i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    public static String revStr (String str ) {
        String result = "";
        for (int i=str.length()-1;i>=0;i--){
            result = result + str.charAt(i);
        }
        return result;
    }
}
