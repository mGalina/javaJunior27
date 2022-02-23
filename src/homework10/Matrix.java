package homework10;


public class Matrix implements IMatrix {

    private double[][] numbers;

    public Matrix(int row, int col) {
        numbers = new double[row][col];
    }

    public Matrix(double[][] numbers) {
        this.numbers = numbers;
    }

    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= getRows()) {
            System.out.println("Неверный индекс строки!");
            return -1;
        }
        if (colIndex < 0 || colIndex >= getColumns()) {
            System.out.println("Неверный индекс колонки!");
            return -1;
        }
        return numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex >= getRows()) {
            System.out.println("Неверный индекс строки!");
            return;
        }
        if (colIndex < 0 || colIndex >= getColumns()) {
            System.out.println("Неверный индекс колонки!");
            return;
        }
        numbers[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        // this - первая матрица
        // otherMatrix = вторая матрица

        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Не одинаковое количество колонок!");
            return null;
        }

        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Не одинаковое количество строк!");
            return null;
        }

        Matrix matrix = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                matrix.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return matrix;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        // this - первая матрица
        // otherMatrix = вторая матрица

        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Не одинаковое количество колонок!");
            return null;
        }

        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Не одинаковое количество строк!");
            return null;
        }

        Matrix matrix = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                matrix.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return matrix;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getColumns()) {
            System.out.println("Количество строк в первом множетеле не рано количеству столбцов во втором!");
            return null;
        }
        if (this.getColumns() != otherMatrix.getRows()) {
            System.out.println("Количество столбцов в первом множетеле не рано количеству строк во втором!");
            return null;
        }
        Matrix matrix = new Matrix(this.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                for (int k = 0; j < otherMatrix.getColumns(); k++) {
                    numbers[i][j] += this.getValueAt(i, k) * otherMatrix.getValueAt(k, j);
                }
            }
        }
        return null;
    }

    @Override
    public IMatrix mul(double value) {
        Matrix matrix = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                matrix.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
        }
        return matrix;
    }

    @Override
    public IMatrix transpose() {
        Matrix matrix = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                matrix.setValueAt(i, j, this.getValueAt(j, i));
            }
        }
        return matrix;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                numbers[i][j] = value;
            }
        }
    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                if (numbers[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        int sum = 0;
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                if (numbers[i][i] != 1) {
                    return false;
                }
                sum += numbers[i][j];
            }
        }
        return sum == numbers.length;
    }

    @Override
    public boolean isSquareMatrix() {
        return getColumns() == getRows();
    }

    @Override
    public IMatrix printToConsole() {
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        return null;
    }
}
