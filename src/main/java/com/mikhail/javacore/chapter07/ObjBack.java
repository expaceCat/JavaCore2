package main.java.com.mikhail.javacore.chapter07;

public class ObjBack {
    int a;

    ObjBack(int i) {
        a = i;
    }
    ObjBack incrByTen() {
        ObjBack objBack = new ObjBack(a+10);
        return objBack;
    }
}

class RetOb {
    public static void main(String[] args) {
        ObjBack objBack = new ObjBack(2);
        ObjBack objBack2;

        objBack2 = objBack.incrByTen();
        System.out.println("objBack.a: " + objBack.a);
        System.out.println("objBack2.a: " + objBack2.a);

        objBack2 = objBack2.incrByTen();
        System.out.println("objBack.a после второго увеличения значения: " + objBack2.a);
    }
}
