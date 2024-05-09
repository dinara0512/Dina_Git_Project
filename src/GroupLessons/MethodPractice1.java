package GroupLessons;

public class MethodPractice1 {
    /*
       Task:
		create a method that can print odd numbers between 1-100 in the
		same line saperated by space

		create a method that can print even numbers between 1-100 in the
		same line saperated by space


        method odd
        for(1-100)
        if odd
        print num+ space

        method even
        for(1-100)
        if even
        print num+ space

        main method
        even (). sout
        odd().sout



     */
        public static void odd (){
            for(int i = 1 ; i<=100 ; i++){
                if(i%2==1){
                    System.out.print(i+" ");
                }
            }
        }
        public static void even (){
            for (int i = 1; i <= 100; i++) {
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
        }
        public static void main(String[] args) {
            odd();
            System.out.println();
            even();
        }
    }

