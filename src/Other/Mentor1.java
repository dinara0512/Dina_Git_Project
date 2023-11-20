package Other;

public class Mentor1 {
    public static void main(String[] args) {

        String name = "dina";


        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));

       // int index = 0;
        for (int i = 0; i <4; i++) {
            System.out.println(name.charAt(i));
            /*
            1. index =0
            2. i=1;
            3. checking condition  1<=4;
            4.ignore the update for the first iteration
            5.go inside the loop body
            6.print out dina. charAt index =0;
            7. will print d;
            8. update i=2;
            9.2<=4;
            10.print out dina charAt index =1;
            11.will print i;
            12.update i=3;
            13.will print a
             */
        }

            for (int j = name.length()-1; j >=0 ; j--) {
                System.out.println(name.charAt(j));
            }
        }
    }


