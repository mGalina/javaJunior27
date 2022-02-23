package homework;

public class NumericalUtils {

    public static double areaOfTriangle(double sideOne, double sideTwo, double sideThree) {

        double perimeter = (sideOne + sideTwo + sideThree) / 2;
        double area = Math.sqrt(perimeter * (perimeter - sideOne) * (perimeter - sideTwo) * (perimeter - sideThree));
        System.out.println("Площадь треугольника: " + area);
        return area;
    }

    public static double areaOfAnIsoscelesTriangle(double side, double base) {

        double areaTriangle = (base / 4) * Math.sqrt(4 * Math.pow(side, 2) - Math.pow(base, 2));
        System.out.println("Площадь равнобедренного треугольника: " + areaTriangle);
        return areaTriangle;
    }
}