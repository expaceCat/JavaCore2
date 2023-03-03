package main.java.com.mikhail.javacore.chapter05;

public class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j ++) {
                nums[i][j] = (i+1) * (j+1);
            }
        }
        for(int x[] : nums) {
            for (int i : x) {
                System.out.println("Value = " + i);
                sum += i;
            }
        }
        System.out.println("Summ = " + sum);
    }
}
