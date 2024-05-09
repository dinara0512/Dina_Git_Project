package top_20_Java_questions;

public class Reverse_Words {
    /*
    Write a method that will take a string as an argument. The method will reverse the position of words and return it.
     */
    public static void main(String[] args) {
        System.out.println(revWords("apple banana kiwi")); // kiwi banana apple
        System.out.println(revWords("I am John Doe")); // Doe John am I
        System.out.println(revWords("orange")); // orange
    }

    public static String revWords(String str) {
        StringBuilder res = new StringBuilder();

        // split input string by " " space to get each word as String[]
        String[] words = str.split(" ");

        // loop over the array from back
        for(int i = words.length - 1; i >= 0; i--) {
            // add words to res with space
            res.append(words[i]).append(" ");
        }

        // trim needed to remove last space in the end
        return res.toString().trim();
    }
}

