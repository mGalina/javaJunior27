package lasson10;

public class Main1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        Animal[] animals = {cat1, dog2, cat3, cat2, dog1};

        for(Animal a: animals) {
            a.voice(); //проявление полиморфизма
        }
    }
}
