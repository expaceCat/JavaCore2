package main.java.com.mikhail.javacore.chapter07;

public class StaticDemo {
    static int a = 42;
    static int b = 99;

    static void collMe() {
        System.out.println("a = " + a);
    }
}

class StaticByName {
    public static void main(String[] args) {
        StaticDemo.collMe();
        System.out.println("b = " + StaticDemo.b);
    }
}