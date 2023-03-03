package main.java.com.mikhail.javacore.chapter03;
// Продемонстрировать применение двумерного массива
public class TwoDArray {
    public static void main(String[] args) {
        int twoD[][] = new int[4][5]; //инициализировали двумерный массив
        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        } // прошлись по всем ячейкам массива и добавили в них переменную к
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {  //выводим строку массива
                System.out.print(twoD[i][j] + " ");
                }
            System.out.println(); //выводим столбец
        }
    }
}
