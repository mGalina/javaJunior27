package homework9;

public class Square {
    private Rectangle rectangle = new Rectangle();

    public Square() {
    }

    public Square(int a) {
        rectangle.setA(a);
        rectangle.setB(a);
    }

    public int getA() {
        return rectangle.getA();
    }

    public void setA(int a) {
        rectangle.setA(a);
        rectangle.setB(a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return rectangle != null ? rectangle.equals(square.rectangle) : square.rectangle == null;
    }

    @Override
    public int hashCode() {
        return rectangle != null ? rectangle.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Квадрат: {" +
                "сторона=" + getA() +
                '}';
    }
}
