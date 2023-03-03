package main.java.com.mikhail.javacore.chapter07;

public class Box2 {
    double width;
    double height;
    double dept;

    Box2(Box2 ob) {
        width = ob.width;
        height = ob.height;
        dept = ob.dept;
    }

    Box2(double w, double h, double d) {
        width = w;
        height = h;
        dept = d;
    }

    Box2() {
        width = -1;
        height = -1;
        dept = -1;
    }

    Box2(double len) {
        width = height = dept;
    }

    double volume() {
        return width*height*dept;
    }
}

class OverloadCons2 {
    public static void main(String[] args) {
        Box2 mybox1 = new Box2(10, 20, 15);
        Box2 mybox2 = new Box2();
        Box2 mycube = new Box2(7);
        Box2 myclone = new Box2(mybox1);

        double vol;
        vol = mybox1.volume();
        System.out.println("Volume mybox1 = " + vol);

        vol = mybox2.volume();
        System.out.println("Volume mybox2 = " + vol);

        vol = mycube.volume();
        System.out.println("Volume cube = " + vol);

        vol = mycube.volume();
        System.out.println("Volume clone = " + vol );


    }
}
