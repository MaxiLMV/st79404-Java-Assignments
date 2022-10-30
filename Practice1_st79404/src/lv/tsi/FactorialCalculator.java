package lv.tsi;
import java.util.*;

public class FactorialCalculator {
    static int toInt(String s) {
        try {
            return Integer.parseInt(s);
        }
        catch (NumberFormatException e) {
            System.out.println("Factorial = 0");
            return 0;
        }
    }
    static int loopMethod(int X) {
        int m = 1;
        for (int i = 2; i <= X; i++) {
            m = m * i;
        }
        return m;
    }
   static int recMethod(int X) {
        if (X >= 1) {
            return X * recMethod(X - 1);
        } else {
            return 1;
        }
   }
   public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       System.out.println("Enter factorial: ");
       int n = toInt(scan.nextLine());
       System.out.println(n + "! = " + loopMethod(n) + "(for loop)");
       System.out.println(n + "! = " + recMethod(n) + "(recursive call)");
   }
}
