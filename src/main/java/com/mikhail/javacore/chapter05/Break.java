package main.java.com.mikhail.javacore.chapter05;

public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("Before break");
                    if(t) break second;
                    System.out.println("This is not use");
                }
                System.out.println("This is not use");
            }
            System.out.println("This after block second");
        }
    }
}
