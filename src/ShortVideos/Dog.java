package ShortVideos;
//sub class  or chicl class
public class Dog extends Animal {
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void barking(){
        System.out.println(name + " is barking");
    }
}
