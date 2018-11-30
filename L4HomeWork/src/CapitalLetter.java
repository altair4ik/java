import java.util.Scanner;

public class CapitalLetter {
    static String toUpperFirstLetter(String str) {
        char[] strChar = str.toCharArray();
        strChar[0] = Character.toUpperCase(strChar[0]);
        for (int i = 0; i < strChar.length; i++) {
            if (strChar[i] == ' ' && i != strChar.length-1) {
                strChar[i+1] = Character.toUpperCase(strChar[i+1]);
            }
        }
        return new String(strChar);
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
