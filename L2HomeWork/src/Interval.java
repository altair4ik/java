import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        System.out.println("Добро подаловать в Интервал");
        System.out.println("Введите число от 0 - 100");
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.next());

        if ((num >= 0) && (num <= 14)) {
            System.out.println("Вы попали в диапазон от 0 - 14");
        } else if ((num >= 15) && (num <= 35)) {
            System.out.println("Вы попали в диапазон от 15 - 35");
        } else if ((num >= 36) && (num <= 50)) {
            System.out.println("Вы попали в диапазон от 36 - 50");
        } else if ((num >= 51) && (num <= 100)) {
            System.out.println("Вы попали в диапазон от 51 - 100");
        } else {
            System.out.println("Вы не попали в дипазон от 0 - 100");
        }
    }
}
