import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int k = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = k;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в BubbleSort");
        System.out.println("Введите 10 чисел");
        Scanner in = new Scanner(System.in);
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(in.next());
        }
        System.out.println(Arrays.toString(sort(arr)));
    }
}
