package homework9;

public class Figures {
    private String name;
    private double square;
    private double perimeter;

    public Figures() {
    }

    public Figures(String name, double square, double perimeter) {
        this.name = name;
        this.square = square;
        this.perimeter = perimeter;
    }

    public Figures(double square, double perimeter) {
        this.square = square;
        this.perimeter = perimeter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Figures figures = (Figures) o;

        if (Double.compare(figures.square, square) != 0) return false;
        if (Double.compare(figures.perimeter, perimeter) != 0) return false;
        return name.equals(figures.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(square);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(perimeter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Figures{" +
                "name='" + name + '\'' +
                ", square=" + square +
                ", perimeter=" + perimeter +
                '}';
    }
}
