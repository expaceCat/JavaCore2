package main.java.com.mikhail.javacore.chapter09;

public class InputInterf {
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

class Base implements InputInterf.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

class NestedIFDemo {
    public static void main(String[] args) {
        InputInterf.NestedIF a = new Base();
        if(a.isNotNegative(10)) {
            System.out.println("Число 10 не отрицательное");
        }
        if(a.isNotNegative(-12)) {
            System.out.println("Это не будет выведено");
        }
    }
}