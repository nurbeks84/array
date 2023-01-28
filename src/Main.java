
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        divideOddNumbers(a);



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

    public static void sort(int[] newArray){
        int temp = 0;
        for (int l = 0; l < newArray.length; l++) {
            for (int i = 0; i < newArray.length; i++) {
                if (newArray[l]<newArray[i]){
                    temp = newArray[l];
                    newArray[l] = newArray[i];
                    newArray[i] = temp;
                }
            }
        }
        for (int a:newArray) {
            System.out.print(a+" ");
        }
    }

    public static void divideOddNumbers(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (i%2!=0){
                System.out.println(array[i]+" ");
            }

        }
    }


}

