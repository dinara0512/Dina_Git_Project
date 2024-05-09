package ShortVideos;

public class Interview1 {
    /*
    reverse

    *declare variable
    *iterate through loop

     */
    public static void main(String[] args) {
        String word = "Teacher";
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        System.out.println(reverse);
    }
}

