package GroupLessons;

public class WrapperClass {
    public static void main(String[] args) {
        //primitives
        byte b = 10;
        short s =20;
        int i =30;
        double d =30.5;

        //autoboxing
        //Wrapper class
        Byte bb=b;
        Short ss=s;
        Integer ii = 30;
        Double dd = 30.5;

        //unboxing
        byte bbb = bb;
        short sss = ss;
        int iii = ii;
        double ddd=dd;

        // parse methods - converting String to primitive => returns primitive
        String str = "123";
        Integer.parseInt(str);
        int num1 = Integer.parseInt(str);
        System.out.println("num1 = " + num1);

        //valueOf - converting String to Wrapper class object => return object
        String str1 = "35.5";
        Double num2 = Double.valueOf(str1);
        System.out.println(num2);


    }
}
