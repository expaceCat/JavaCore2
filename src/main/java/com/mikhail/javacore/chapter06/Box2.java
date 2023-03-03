package main.java.com.mikhail.javacore.chapter06;

public class Box2 {
        double width;
        double height;
        double depth;

    double volume() {
        return width * height * depth;
    }

    void setDenim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box2 mb1 = new Box2();
        Box2 mb2 = new Box2();
        double vol;

        mb1.setDenim(10, 20,15);
        mb2.setDenim(3,6,9);

        vol = mb1.volume();
        System.out.println("Volume = " + vol);
        vol = mb2.volume();
        System.out.println("Volume = " + vol);

    }
}