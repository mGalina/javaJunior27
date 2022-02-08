package lasson10;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];

        figures[0] = new Cercle(12);
        figures[1] = new Eclipse(2, 4);
        figures[2] = new Square(34);
        figures[3] = new Rectangle(10, 15);
        figures[4] = new Triangle(5, 6, 8);

        // быстрый проход по массиву for each
        for (Figure f:figures){
            System.out.println("-----------");
            System.out.println(f);
            System.out.println(f.perimetr()); // проявление полиморфизма
        }
    }
}
