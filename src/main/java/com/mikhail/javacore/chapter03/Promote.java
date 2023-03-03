package main.java.com.mikhail.javacore.chapter03;

public class Promote {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b) + (i / c) - (d * s); //в первом выраж. тип продв. к флоат, как и рез.
                                                    //во втором выраж. тип продв. к инт, как и рез.
                                                    //в третьем выраж тип продв к доубл, как и рез.
                                                    //рез флот + инт = флот, флот - доубл = доубл
        System.out.println((f * d) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
    }
}
