package main.java.com.mikhail.javacore.chapter09;

public class Client implements Callback, Readme{
    public void callback(int p) {
        System.out.println("Method callback(), with param " + p);
    }

    void nonIfaceMeth() {
        System.out.println("In class, realise interface, " + " can be other methods");
    }

    @Override
    public void readText() {
        System.out.println("I read text");
    }
}

class TestInterface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
        Readme c2 = new Client();
        c2.readText();
    }
}
