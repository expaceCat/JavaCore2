package main.java.com.mikhail.javacore.chapter08;

public class Ag {
    int i, j;
    Ag(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class Bg extends Ag {
    int k;
    Bg(int a, int b, int c) {
        super(a,b);
        k = c;
    }

    void show() {
        System.out.println("k: " + k);
    }
}

class Override {
    public static void main(String[] args) {
        Bg subOb = new Bg(1, 2, 3);
        subOb.show();
    }
}

