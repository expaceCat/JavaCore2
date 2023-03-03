package main.java.com.mikhail.javacore.chapter07;

public class OverloadDemo2 {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println(" Внутреннее преобразование при вызове test (douЬle а): " + a);
    }

}

class Overload2 {
    public static void main(String[] args) {
        OverloadDemo2 ob2 = new OverloadDemo2();
        int i = 88;
        ob2.test();
        ob2.test(10, 20);

        ob2.test(i);
        ob2.test(123.2);
    }
}
