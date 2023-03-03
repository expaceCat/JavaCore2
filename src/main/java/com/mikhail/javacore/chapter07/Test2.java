package main.java.com.mikhail.javacore.chapter07;

public class Test2 {
    int a, b;
    Test2(int i, int j) {
        a = i;
        b = j;
    }
    void meth(Test2 o) {
        o.a *= 2;
        o.b /= 2;
    }
}

class CallByValue {
    public static void main(String[] args) {
        Test2 ob = new Test2(15, 20);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);

        ob.meth(ob);
        System.out.println("a and b  after call: " + ob.a + " " + ob.b);
    }
}
