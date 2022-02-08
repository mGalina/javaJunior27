package homework9;

public class Rectangle extends Figures {
    private double sideOne;
    private double sideTwo;

    public Rectangle() {
    }

    public Rectangle(double square, double perimeter) {
        super(square, perimeter);
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }
}