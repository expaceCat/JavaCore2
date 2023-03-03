package main.java.com.mikhail.javacore.chapter08;

public class A {
    int i;
}

class B extends A {
    private int i;
    B(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Члены i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1, 2);
        subOb.show();
    }
}