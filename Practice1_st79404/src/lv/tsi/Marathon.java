package lv.tsi;

public class Marathon {
    static void printResults(String[] arr1, int[] arr2) {
        System.out.println("Name  Result");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
            System.out.print(arr2[i]);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String [] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int [] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
        printResults(names, times);
    }
}
