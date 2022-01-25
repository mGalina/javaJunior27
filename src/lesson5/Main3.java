package lesson5;

public class Main3 {
    public static void main(String[] args) {
        int[][] nums = new int[8][8];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                } else {
                    if (j % 2 != 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
            }
            System.out.println();
        }
    }
}
