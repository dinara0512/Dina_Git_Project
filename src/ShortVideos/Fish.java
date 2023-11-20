package ShortVideos;

public class Fish extends Animal {
    public Fish(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void swimming () {
        System.out.println(name + " is swimming");
    }
}
