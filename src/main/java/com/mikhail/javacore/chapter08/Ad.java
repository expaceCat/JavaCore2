package main.java.com.mikhail.javacore.chapter08;

public class Ad {
    Ad() {
        System.out.println("In constructor A.");
    }
}

class Bd extends Ad{
    Bd() {
        System.out.println("In constructor B.");
    }
}

class C extends Bd {
    C() {
        System.out.println("In constructor C");
    }
}

class CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}
