package lv.tsi;
import java.util.*;

public class OneDimensionalArray {
    static double[][] createRandomArray(int size) {
        double arr[][] = new double[size][size];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Math.round(random.nextDouble(100)*100.0)/100.0;
            }
        }
        return arr;
    }
    static void printArray(double[][] arr) {
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static double arrayMean(double[][] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        else {
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    sum += arr[i][j];
                }
            }
            return Math.round(sum / (arr.length * arr.length)*100.0)/100.0;
        }
    }
    public static double arrayMax(double[][] arr) {
        double max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) max = arr[i][j];
            }
        }
        return max;
    }

    public static double arrayMin(double[][] arr) {
        double min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) min = arr[i][j];
            }
        }
        return min;
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
        double array[][];
        array = createRandomArray(n);
        printArray(array);
        System.out.println("Largest value of the array: " + arrayMax(array));
        System.out.println("Smallest value of the array: " + arrayMin(array));
        System.out.println("Mean of the array: " + arrayMean(array));
    }
}
