package lesson5;

public class Main2 {
    public static void main(String[] args) {
        int[][] nums = new int[4][5];

//        System.out.print(nums[0][0] + " ");
//        System.out.print(nums[0][1] + " ");
//        System.out.print(nums[0][2] + " ");
//        System.out.print(nums[0][3] + " ");
//        System.out.print(nums[0][4] + " ");
//        System.out.println();
//
//        System.out.print(nums[1][0] + " ");
//        System.out.print(nums[1][1] + " ");
//        System.out.print(nums[1][2] + " ");
//        System.out.print(nums[1][3] + " ");
//        System.out.print(nums[1][4] + " ");
//        System.out.println();
//
//        System.out.print(nums[2][0] + " ");
//        System.out.print(nums[2][1] + " ");
//        System.out.print(nums[2][2] + " ");
//        System.out.print(nums[2][3] + " ");
//        System.out.print(nums[2][4] + " ");
//        System.out.println();
//
//        System.out.print(nums[3][0] + " ");
//        System.out.print(nums[3][1] + " ");
//        System.out.print(nums[3][2] + " ");
//        System.out.print(nums[3][3] + " ");
//        System.out.print(nums[3][4] + " ");
//        System.out.println();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
