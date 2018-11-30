import java.util.Scanner;

public class CapitalLetter {
    static String toUpperFirstLetter(String str) {
        StringBuilder sb = new StringBuilder();
        char[] strChar = str.toCharArray();
        strChar[0] = Character.toUpperCase(strChar[0]);
        for (int i = 0; i < strChar.length; i++) {
            if (strChar[i] == ' ') {
                strChar[i+1] = Character.toUpperCase(strChar[i+1]);
            }
            sb.append(strChar[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Добро пожаловать в CapitalLetter");
        System.out.println("Введите строку");
        String str = in.nextLine();
        System.out.println(str);
        System.out.println(toUpperFirstLetter(str));
    }
}
