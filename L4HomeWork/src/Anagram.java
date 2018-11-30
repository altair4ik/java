import java.util.Arrays;

public class Anagram {
    static String toSortLetters(String str) {
        StringBuilder sb = new StringBuilder();
        char[] charStr = str.toCharArray();
        Arrays.sort(charStr);
        for (char item: charStr) {
            if (!Character.toString(item).matches("(?U)[^\\w]")) {
                sb.append(item);
            }
        }
        return sb.toString();
    }

    static Boolean isAngram(String str1, String str2) {
        String s1 = toSortLetters(str1);
        String s2 = toSortLetters(str2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        return true;
    }

    public static void main(String[] args) {
       isAngram("ка-мы,.,.ш ап", ",.,па,.м,.ы,. шка");
    }
}
