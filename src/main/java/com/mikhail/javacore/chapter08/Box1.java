package main.java.com.mikhail.javacore.chapter08;

public class Box1 {
    double width;
    double height;
    double depth;

    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxWeight3 extends Box1 {
    double weight;

    BoxWeight3(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }
}
