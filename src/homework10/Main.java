package homework10;

public class Main {
    public static void main(String[] args) {

        Matrix matrix = new Matrix(3, 4);

        double[][] num1 = {{2, 4, 5},
                {1, 4, 6.5},
                {3, 8, 0.1}};
        Matrix matrix1 = new Matrix(num1);

        double[][] num2 = {{1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}};
        Matrix matrix2 = new Matrix(num2);

        //1. Возвращает количество строк матрицы
        System.out.println("Количество строк: " + matrix.getRows());

        //2. Возвращает количество столбцов строк матрицы
        System.out.println("Количество столбцов: " + matrix.getColumns());

        //3. Возвращает элемент матрицы по индексам ??
        System.out.println("Элемент матрицы по индексу 0,0: " + matrix.getValueAt(0, 0));

        //4. Устанавливает элемент матрицы по индексам
        System.out.println("Установлен элемент матрицы по индексу 0,0: ");
        matrix.setValueAt(0, 0, 1);
        matrix.printToConsole();
        matrix.setValueAt(0, 0, 0);

        //5. Возвращает сумму текущей матрицы и второго аргумента
        System.out.println("Сумма текущей матрицы и второго аргумента: ");
        IMatrix add = matrix2.add(matrix1);
        add.printToConsole();

        //6. Возвращает разность текущей матрицы и второго аргумента
        System.out.println("Разность текущей матрицы и второго аргумента: ");
        IMatrix sub = matrix2.sub(matrix1);
        sub.printToConsole();

        //7. Возвращает произведение текущей матрицы и второго аргумента
        System.out.println("Произведение текущей матрицы и второго аргумента: ");
        IMatrix mul = matrix2.mul(matrix1);
        mul.printToConsole();

        //8. Возвращает произведение текущей матрицы на число
        System.out.println("Произведение текущей матрицы на число 5: ");
        IMatrix mulByNum = matrix1.mul(5);
        mulByNum.printToConsole();

        //9. Возвращает транспонированную матрицу по отношению к текущей
        System.out.println("Транспонированная матрица: ");
        IMatrix trans = matrix1.transpose();
        trans.printToConsole();

        //10. Заполняет текущю матрицу заднным значением
        System.out.println("Заполняет текущю матрицу заднным значением 3: ");
        matrix1.fillMatrix(3);
        matrix1.printToConsole();

        //11.Вычисляет детерминант матрицы.


        //12. Проверяет является ли текущая матрица нулевой
        System.out.println("Проверяет является ли текущая матрица нулевой: ");
        System.out.println(matrix.isNullMatrix());
        System.out.println(matrix1.isNullMatrix());
        System.out.println(matrix2.isNullMatrix());

        //13. Проверяет является ли текущая матрица единичной
        System.out.println("Проверяет является ли текущая матрица единичной: ");
        System.out.println(matrix.isIdentityMatrix());
        System.out.println(matrix1.isIdentityMatrix());
        System.out.println(matrix2.isIdentityMatrix());

        //14. Проверяет является ли текущая матрица квадратной
        System.out.println("Проверяет является ли текущая матрица квадратной: ");
        System.out.println(matrix.isSquareMatrix());
        System.out.println(matrix1.isSquareMatrix());
        System.out.println(matrix2.isSquareMatrix());

        //15. Вывод матриц на консоль
        System.out.println("Вывод матриц на консоль: ");
        matrix.printToConsole();
        System.out.println();
        matrix1.printToConsole();
        System.out.println();
        matrix2.printToConsole();
    }
}
