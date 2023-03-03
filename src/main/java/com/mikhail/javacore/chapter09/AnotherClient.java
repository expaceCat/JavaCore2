package main.java.com.mikhail.javacore.chapter09;

public class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Variant of callback() method");
        System.out.println("p in squared = " + (p*p));
    }
}

class TestInterface2 {
    public static void main(String[] args) {


        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);
        c = ob;
        c.callback(42);

    }
}
