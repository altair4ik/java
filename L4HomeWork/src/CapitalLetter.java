import java.util.Scanner;

public class CapitalLetter {
    static String toUpperFirstLetter(String str) {
        String[] strParts = str.split("");
        strParts[0] = strParts[0].toUpperCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strParts.length; i++) {
            sb.append(strParts[i]);
            if (i == strParts.length -1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    static String toUpperFirstLetterString(String str) {
        String[] strParts = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strParts.length; i++) {
            sb.append(toUpperFirstLetter(strParts[i]));
        }
        sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Добро пожаловать в CapitalLetter");
        System.out.println("Введите строку");
        String str = in.nextLine();
        System.out.println(str);
        System.out.println(toUpperFirstLetterString(str));
    }
}
