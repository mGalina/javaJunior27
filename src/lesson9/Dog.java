package lesson9;

public class Dog extends Animal{

    public Dog(){

    }

    public Dog(String name, int age){
        //Вапиант 1 (присвоение полей родительскому классу)
//        this.setAge(age);
//        this.setName(name);

        //Вапиант 2 (смена модификатора доступа в родительском классе)
//        this.name = name;

        //Вапиант 3 (с помощью родительского конструктора)
        super(name, age);
    }

    public void voice(){
        System.out.println("Гав-гав");
    }
}
