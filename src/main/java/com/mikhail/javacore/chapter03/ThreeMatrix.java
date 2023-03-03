package main.java.com.mikhail.javacore.chapter03;
// Продемонстрировать применение трехмерного массива
public class ThreeMatrix {
    public static void main(String[] args) {
        int threeD[][][] = new int[3][4][5]; //создаем трехмерный массив
        int i, j, k;
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                for(k = 0; k < 5; k++) {
                    threeD[i][j][k] = i * j * k; //заполняем массив
                }
            }
        }

        for(i = 0; i < 3; i++) {
            for(j = 0; j < 4; j++) {
                for(k = 0; k < 5; k++) {
                    System.out.print(threeD[i][j][k] + " "); // выводим содержимое массива
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
