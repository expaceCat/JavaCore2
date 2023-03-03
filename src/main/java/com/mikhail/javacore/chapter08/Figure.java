package main.java.com.mikhail.javacore.chapter08;

public abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectengle extends Figure {
    Rectengle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("In rectangle.");
        return dim1*dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("In triangle.");
        return dim1*dim2/2;
    }
}

class FindAreas {
    public static void main(String[] args) {
        Rectengle r = new Rectengle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figuref;

        figuref = r;
        System.out.println("Area = " + figuref.area());

        figuref = t;
        System.out.println("Area = " + figuref.area());


    }
}

