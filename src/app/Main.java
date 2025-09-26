package app;
import java.util.Scanner;

public class Main {
    private static final double KM_PER_MILE = 1.60934;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("App for distance converting.");

        System.out.print("Convert miles to kilometers. Enter miles: ");
        double miles = scanner.nextDouble();
        System.out.println(miles + " miles is " + milesToKm(miles) + " kilometers.");

        System.out.print("Convert kilometers to miles. Enter kilometers: ");
        double km = scanner.nextDouble();
        System.out.println(km + " kilometers is " + kmToMiles(km) + " miles.");
    }

    private static double milesToKm(double miles) {
        return miles * KM_PER_MILE;
    }

    private static double kmToMiles(double km) {
        return km / KM_PER_MILE;
    }
}