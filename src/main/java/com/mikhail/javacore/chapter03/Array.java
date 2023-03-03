package main.java.com.mikhail.javacore.chapter03;

public class Array {
    public static void main(String[] args) {
        int month_days[]; //создаем переменную - массив
        month_days = new int[12]; //инициализируем массив
        month_days[0] = 31; //добавляем в него значения соответсвтующего типа
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        System.out.println("В апреле " + month_days[3] + " дней");
    }
}
