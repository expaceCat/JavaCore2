package main.java.com.mikhail.javacore.chapter07;

public class Box {
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20,50);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume mybox1 = " + vol);
        vol = mybox2.volume();
        System.out.println("Volume mybox2 = " + vol);
        vol = mycube.volume();
        System.out.println("Volume mycube = " + vol);
    }
}
