package RamizInterviewPractice;

public class Animal {
    public static void main(String[] args) {
//        Animal animal1 = new Animal("Jack", 10, "Golden Retriever");
//        System.out.println(animal1);

      String name = "Alina";
      String reversed = "";
        for (int i = name.length()-1; i >=0 ; i--) {
            reversed+=name.charAt(i);
        }
        System.out.println(reversed);


    }
    public String name;
    public int age;
    public String breed;

    @Override
    public String toString() {
        return "Animal name: " + name +
                ", age: " + age +
                ", breed: " + breed;
    }

    public Animal (String name,int age,String breed) {
        this.name=name;
        this.age = age;
        this.breed = breed;
    }
}
