package ShortVideos;

public class Static {
    // each circle object will have its own radius, instance variable
    public double radius;
    //generate a constructor with parameter
    //only one copy is needed, and if I change in here it will change everywhere, static variable
    public static double pi=3.14;
    //we can not use static method if we want to use instance variable, instance method
    public double calculateArea () {
        return radius * radius *pi;
    }
    //instance method
    public double calculatePerimeter(){
        return 2* radius * pi;
    }
    // print PI, as pi is static I can now create static method, static method
    public static void printPI() {
        System.out.println(pi);
    }

    @Override
    public String toString() {
        return "Static{" +
                "radius=" + radius +
                '}';
    }
}
