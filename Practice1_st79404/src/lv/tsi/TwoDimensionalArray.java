package lv.tsi;
import java.util.*;

public class TwoDimensionalArray {
    static int[][] createRandomArray(int size) {
        int arr[][] = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
        return arr;
    }
    static void printArray(int[][] arr) {
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void arrayMean(int[][] arr) {
         int sum = 0;
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 sum += arr[i][j];
             }
             System.out.println("Array Average " + (i+1) + ": " + sum / arr.length);
             sum = 0;
         }
     }
    static int toInt(String s) {
        try {
            return Integer.parseInt(s);
        }
        catch (NumberFormatException e) {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = toInt(scan.nextLine());
        int array[][];
        array = createRandomArray(n);
        printArray(array);
        arrayMean(array);
    }
}
