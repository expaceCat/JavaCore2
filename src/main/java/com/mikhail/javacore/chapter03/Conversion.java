package main.java.com.mikhail.javacore.chapter03;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nПреобразование типа int в тип byte.");
        b = (byte) i; //значение приводится к типу байт, его значение остаток от деления на диап. допуст. знач байт
        System.out.println("i и b " + i + " " + b);

        System.out.println("\nПреобразование типа double в тип int.");
        i = (int) d; //при преобразовании дробная часть отбрасывается
        System.out.println("d и i " + d + " " + i);

        System.out.println("\nПреобразование типа double в тип byte.");
        b = (byte) d; //дробная часть отбрасывается, остается остаток деления по модулю на 256
        System.out.println("d and b " + d + " " + b);

    }
}
