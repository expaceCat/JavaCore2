package main.java.com.mikhail.javacore.chapter08;

class Box{
private double width;
private double height;
private double depth;

        Box(Box ob)  {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
        }

        Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
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
        return width*height*depth;
        }
}

class BoxWeight extends Box{
    double weight;

    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight() {
        super();
        weight = -1;
    }
    BoxWeight(double len, double m ) {
        super(len);
        weight = m;
    }

}

class Shipment extends BoxWeight {
    double cost;

    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;
    }
}

class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment ( 10, 20, 15, 10, 3.41 ) ;
        Shipment shipment2 = new Shipment (2, 3, 4, 0.76, 1.28) ;

        double vol ;
        vol = shipment1.volume ( ) ;
        System.out.println( "Oбъeм shipment 1 равен " + vol ) ;
        System . out . println ("Bec shipment 1 равен " + shipment1.weight );

        System.out . println ("Cтoимocть доставки : $" + shipment1.cost);
        System . out . println ();
        vol = shipment2.volume();
        System.out.println("Oбъeм shipment2 равен " + vol ) ;
        System . out . println ( " Bec shipment2 равен " + shipment2.weight);
        System.out.println("Cтoимocть доставки : $ " + shipment2.cost);
    }
}