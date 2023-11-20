package GroupLessons;

public class MethodPractice2 {



    public static String duplicateCharacters(String str) {
        String duplicates = "";
        for (int i = 0; i < str.length(); i++) {
            char eachOuterLetter = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                char eachInnerLetter = str.charAt(j);

                if (eachOuterLetter == eachInnerLetter) {
                    count++;
                }

            }


            if (count > 1) { // This condition check if the letter is in the String ONLY 1 time. If, TRUE, add it into the new String container called 'uniques'
                if (duplicates.indexOf(eachOuterLetter) == -1) {
                duplicates += eachOuterLetter; // uniques = uniques + ("" + eachOuterLetter);
            }

        }
        }

        return duplicates;

    }

    public static void main(String[] args) {
        String duplicateChar = "aaaaabcccdeeff";


        System.out.println(duplicateCharacters(duplicateChar));

    }
}
