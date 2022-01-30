package lesson8;

public class Person {
    // 1- объявляются характеристики объекта (поля класса, переменные класса)
    private String name;
    private String position;
    private int salary;
    private int age;

    // 2 - конструкторы (то что вызывается после слова new),
    // это особый метод, который создает новый объект и возвращает новый объект
    // почти всегда public
    public Person(int age, String position) {
        this.age = age;
        this.position = position;
    }

    public Person() {

    }

    public Person (String name, String position, int salary, int age) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.age = age;
    }

    // 3 - методы (то что умеет этот тип)
    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return this.age;
    }

    public String getPosition() {
        return this.position;
    }
}
