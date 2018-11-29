import java.util.Random;
import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {
        final int R = new Random().nextInt(101);
        System.out.println("Добро пожаловать в Bingo, для вызода напишите exit");
        System.out.println("Отгадайте число от 0 - 100");
        Scanner in = new Scanner(System.in);
        int counter = 0;

        for ( ; ;) {
            System.out.println("Введите число");
            String input = in.next();
            if (input.equals("exit")) {
                System.out.println("Досвидания!");
                break;
            }
            int inputNumber = Integer.parseInt(input);

            if (R == inputNumber) {
                System.out.println("Вы угадали это число " + inputNumber + " с " + counter + " попыток.");
                break;
            } else if(R > inputNumber) {
                System.out.println("Задуманное число является больше введенного");
                counter++;
                continue;
            } else if (R < inputNumber) {
                System.out.println("Задуманное число является меньше введенного");
                counter++;
                continue;
            }
        }
    }
}
