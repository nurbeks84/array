
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 8, 3, 3, 4, 4, 9, 12};
        System.out.println(max(a));
        System.out.println(min(a));


    }

    public static int max(int[] array) {
        int max = array[0];
        for (int a : array) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int a : array) {
            if (a < min) {
                min = a;
            }
        }
        return min;
    }


}

