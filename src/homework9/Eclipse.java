package homework9;

public class Eclipse extends Cercle {
    private double radius2;

    public Eclipse() {
    }

    public Eclipse(double radius, double radius2) {
        super(radius);
        this.radius2 = radius2;
    }

    public double getRadius2() {
        return radius2;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Eclipse eclipse = (Eclipse) o;

        return Double.compare(eclipse.radius2, radius2) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Овал: " +
                "radius 1 = " + super.getRadius() +
                "radius 2 = " + radius2 +
                '}';
    }
}
