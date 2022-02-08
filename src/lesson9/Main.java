package lesson9;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Dog dog = new Dog("Шарик", 4);
        Animal dog2 = new Dog("Шарик", 4);

        Object dog3 = new Dog("Бобик", 5);

        System.out.println(dog.equals(dog2));
        System.out.println(dog2.equals(dog3));

        System.out.println(dog.hashCode());
        System.out.println(dog2.hashCode());
        System.out.println(dog3.hashCode());
        System.out.println(dog.hashCode());

        System.out.println(dog.toString());

        //квадрат, прямоугольник, круг, овал, треугольник
        // создать 5 классов, наследование.
    }
}
