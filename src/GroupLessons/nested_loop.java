package GroupLessons;

public class nested_loop {
    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 2; j++)
//                System.out.println(i + " " + j);
//            System.out.println("========");
//        }
//        System.out.println("==========================");
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++)
//                System.out.println(i+"_"+j);
//            System.out.println("========");
//        }
        System.out.println("==========================");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i + " ");
        }
        System.out.println("==========================");
        for (int i = 1; i <= 10; i++) {
            if (i % 6 == 0)
                break;
            System.out.println(i + " ");


        }
    }
}