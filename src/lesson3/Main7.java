package lesson3;

public class Main7 {
    public static void main(String[] args) {
        //создать массив такой же длинны, но положить сумму в соседнюю ячейку
        int[] number = {6, 2, 5, 6, 6};
        int[] sum = new int[number.length];

//        sum[0] = number[0] + number[1];
//        sum[1] = number[0] + number[1] + number[2];
//        sum[2] = number[1] + number[2] + number[3];
//        sum[3] = number[2] + number[3] + number[4];
//        sum[4] = number[3] + number[4];

        for (int i = 0; i < number.length; i++) {
            if (i == 0) {
                sum[0] = number[0] + number[1];
            } else if (i == number.length - 1) {
                sum[number.length - 1] = number[number.length - 2] + number[number.length - 1];
            } else {
                sum[i] = number[i - 1] + number[i] + number[i + 1];
            }
        }
        System.out.println();
    }
}
