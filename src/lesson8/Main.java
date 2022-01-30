package lesson8;

public class Main {
    public static void main(String[] args) {
        //формула создания любого объекта
        //когда нет конструктора, то он генерируется по умолчанию
        Person vasya = new Person();
        vasya.setAge(23);
        vasya.setPosition("Бухгалтер");

        Person petya = new Person(40, "Лесоруб");
        Person olga = new Person("Оля", "Лесоруб", 24000, 30);

        System.out.println(vasya.getAge());
        System.out.println(petya.getAge());
    }
}
