package ArrayListMethods;

import java.security.DigestException;

public class dogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog ();
        Dog dog2 = new Dog ();
        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.gender = 'M';
        dog1.age = 2;
        dog1.size = "big";
        dog1.color = "white";
        System.out.println(dog1);
        dog1.bark();

        dog2.name = "Lucy";
        dog2.breed = "german shepard";
        dog2.gender = 'L';
        dog2.age = 5;
        dog2.size = "small";
        dog2.color = "blackmain";
        System.out.println(dog2);
        dog2.bark();


    }
}
