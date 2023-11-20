package GroupLessons;

public class PracticeTaskPresentation_String_Revers {

        public static void main(String[] args) {
            System.out.println(revStr("apple")); // elppa
            System.out.println(revStr("John")); // nhoJ
            System.out.println(revStr("phone")); // enohp
            System.out.println(revStr("1234567")); // 7654321
        }

        public static String revStr(String str) {
            // create variable to store reversed version of str
            StringBuilder res = new StringBuilder();

            // iterate over input string from the back and use charAt() to get single char
            for (int i = str.length() - 1; i >= 0; i--) {
                res.append(str.charAt(i));
            }

            // convert to string and return reversed version
            return res.toString();
        }
    }

