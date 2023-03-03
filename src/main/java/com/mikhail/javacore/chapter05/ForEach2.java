package main.java.com.mikhail.javacore.chapter05;

public class ForEach2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for(int x : nums) {
            System.out.println("Value = " + x);
            sum += x;
            if(x == 5) break;
        }
        System.out.println("Summ 5 elements = " + sum);
    }
}
