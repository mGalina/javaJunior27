package homework9;

public class Main {
    public static void main(String[] args) {

        Figures figures = new Figures("Квадрат", 16,16);

//        Circle circle = new Circle(56);
        Eleps eleps = new Eleps(65, 43.89);
        Rectangle rectangle = new Rectangle(56, 7.9);
        Square square = new Square(5.7, 3.67);
        Triangle triangle = new Triangle( 65, 8.7);

        System.out.println(figures.toString());
    }
}
