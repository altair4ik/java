import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Добро пожаловать в Калькулятор");
        System.out.println("Введите первое число:");
        int first = Integer.parseInt(in.next());
        System.out.println("Введите операцию:");
        String sign = in.next();
        System.out.println("Введите второе число:");
        int second = Integer.parseInt(in.next());

        switch (sign) {
            case "+":
                System.out.println(first + "+" + second + "=" + (first+second));
                break;
            case "-":
                System.out.println(first + "-" + second + "=" + (first - second));
                break;
            case "*":
                System.out.println(first + "*" + second + "=" + (first * second));
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Нельзя делить на 0");
                    break;
                }
                System.out.println(first + "/" + second + "=" + (first / second));
                break;
            default:
                System.out.println("Нет такой операции!!!");
        }
    }
}
