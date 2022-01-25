package lesson4;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        System.out.println("Выберете фигуру: ");
        System.out.println("1 - Круг");
        System.out.println("2 - Овал");
        System.out.println("3 - Треугольник");
        System.out.println("4 - Прямоугольник");
        System.out.println("5 - Трапеция");

        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        if (figure.equals("1") || figure.equalsIgnoreCase("круг")) {

            System.out.println("Введите радиус круга: ");
            String radiusStr = scanner.nextLine();
            double radius = Double.parseDouble(radiusStr);

            System.out.println("Площадь или окружность?");
            String actions = scanner.nextLine();

            if (actions.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь круга: " + (Math.PI * (radius * radius)));
            } else if (actions.equalsIgnoreCase("окружность")) {
                System.out.println("Окружжность круга: " + (2 * Math.PI * radius));
            } else {
                System.out.println("Повторите ввод. Площадь или окружность?");
            }

        } else if (figure.equals("2") || figure.equalsIgnoreCase("овал")) {

            System.out.println("Введите значение одной полуоси: ");
            String axisOneStr = scanner.nextLine();
            double axisOne = Double.parseDouble(axisOneStr);

            System.out.println("Введите значение второй полуоси: ");
            String axisTwoStr = scanner.nextLine();
            double axisTwo = Double.parseDouble(axisTwoStr);

            System.out.println("Площадь овала = " + (axisOne * axisTwo * Math.PI));

        } else if (figure.equals("3") || figure.equalsIgnoreCase("треугольник")) {

            System.out.println("Введите значение стороны: ");
            String sideTriangleStr = scanner.nextLine();
            double sideTriangle = Double.parseDouble(sideTriangleStr);

            System.out.println("Ведите высоту: ");
            String heightStr = scanner.nextLine();
            double height = Double.parseDouble(heightStr);

            System.out.println("Площадь треугольника = " + (0.5 * sideTriangle * height));

        } else if (figure.equals("4") || figure.equalsIgnoreCase("прямоугольник")) {

            System.out.println("Введите значение одной стороны: ");
            String sideOneRectangleStr = scanner.nextLine();
            double sideOneRectangle = Double.parseDouble(sideOneRectangleStr);

            System.out.println("Введите значениее второй стороны: ");
            String sideTwoRectangleStr = scanner.nextLine();
            double sideTwoRectangle = Double.parseDouble(sideTwoRectangleStr);

            System.out.println("Площадь прямоугольника = " + (sideOneRectangle * sideTwoRectangle));

        } else if (figure.equals("5") || figure.equalsIgnoreCase("трапеция")) {

            System.out.println("Введите значение одного основания: ");
            String baseOneStr = scanner.nextLine();
            double baseOne = Double.parseDouble(baseOneStr);

            System.out.println("Введите значение второго основания: ");
            String baseTwoStr = scanner.nextLine();
            double baseTwo = Double.parseDouble(baseTwoStr);

            System.out.println("Введите значение высоты: ");
            String heightTrapezoidStr = scanner.nextLine();
            double heightTrapezoid = Double.parseDouble(heightTrapezoidStr);

            System.out.println("Площадь трапеции = " + (0.5 * (baseOne + baseTwo) * heightTrapezoid));

        } else {
            System.out.println("Вы ничего не выбрали.");
        }
    }
}