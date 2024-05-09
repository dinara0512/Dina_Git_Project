package ShortVideos;

public class CustomMethodsVoid {

    public static void printMessage () {
        System.out.println("Hello world");
        System.out.println("Hello Loop Academy");
        myFirstmethodParam("Ruslan");
    }

    public static void main(String[] args) {
        printMessage();
    }

    public static  void myFirstmethodParam (String name) {
        System.out.println("Hello world "+name);
    }

}
