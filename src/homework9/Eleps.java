package homework9;

public class Eleps extends Figures {
    double majorAxis;
    double minorAxis;

    public Eleps() {
    }

    public Eleps(double square, double perimeter) {
        super(square, perimeter);
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }
}
