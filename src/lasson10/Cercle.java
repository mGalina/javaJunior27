package lasson10;

public class Cercle implements Figure {
    private double radius;

    public Cercle() {
    }

    public Cercle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cercle cercle = (Cercle) o;

        return Double.compare(cercle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double perimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double sposhad() {
        return Math.PI * (radius * radius);
    }
}
