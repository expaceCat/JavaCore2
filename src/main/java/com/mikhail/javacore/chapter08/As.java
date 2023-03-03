package main.java.com.mikhail.javacore.chapter08;

public class As {
    void callme() {
        System.out.println("In method callme() from class As");
    }
}

class Bs extends As {
    void callme() {
        System.out.println("In method callme() from class Bs");
    }
}
class Cs extends As {
    void callme() {
        System.out.println("In method callme() from class Cs");
    }
}

class Dispatch {
    public static void main(String[] args) {
        As a = new As();
        Bs b = new Bs();
        Cs c = new Cs();
        As r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}
