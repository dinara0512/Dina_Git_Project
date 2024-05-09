package ArrayListMethods;

public class Dog {
    /*
    fields (attributes)
    name
    bread
    gender
    size
    age
    color
     */

    public String name;
    public String breed;
    public char gender;
    public String size;
    public int age ;
    public String color;
/*
methods (actions)
eat
drink
bark

 */

    public void eat () {
        System.out.println(name + " is eating");
    }
    public void drink () {
        System.out.println(name + " is drinking");
    }
    public void bark () {
        System.out.println(name + " is barking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
