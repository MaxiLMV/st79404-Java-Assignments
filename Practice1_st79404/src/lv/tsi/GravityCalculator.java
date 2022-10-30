package lv.tsi;
import java.util.*;

public class GravityCalculator {
    static final double a = -9.81;
    static int fallingTime(String fTime) {
        try {
            return Integer.parseInt(fTime);
        }
        catch (NumberFormatException e) {
            return 0;
        }
    }
    static double initialPosition(String iPos) {
        try {
            return Double.parseDouble(iPos);
        }
        catch (NumberFormatException e) {
            return 0;
        }
    }
    static double initialVelocity(String iVel) {
        try {
            return Double.parseDouble(iVel);
        }
        catch (NumberFormatException e) {
            return 0;
        }
    }
    static void formula(int t, double v0, double x0) {
        double finalPosition = (t^2) * a * 0.5 + v0 * t + x0;
        System.out.println ("Position in " + t + " seconds: " + finalPosition);
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int t1;
        double v, x;
        System.out.println("Enter falling time: ");
        t1 = fallingTime(scan.nextLine());
        System.out.println("Enter initial position: ");
        v = initialPosition(scan.nextLine());
        System.out.println("Enter initial velocity: ");
        x = initialVelocity(scan.nextLine());
        formula(t1, v, x);
    }
}
