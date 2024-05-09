package ShortVideos;
//super or parent class
public class Animal {
    public String name;
    public String breed;
    public char gender;
    public int age;
    public String size;
    public String color;
    public void sleep () {
        System.out.println(name + " is sleeping");
    }

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
