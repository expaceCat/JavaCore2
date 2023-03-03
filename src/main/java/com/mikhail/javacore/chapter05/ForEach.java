package main.java.com.mikhail.javacore.chapter05;

public class ForEach {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for(int x : nums) {
            System.out.println("Value x = " + x);
            sum += x;
        }

        System.out.println("Summ = " + sum);
    }
}
