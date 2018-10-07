// Change Return Program
// The user enters a cost and then the amount of money given.
// The program will figure out the change and the number of quarters, dimes, nickels, pennies needed for the change.

import java.util.*;
import java.text.DecimalFormat;

public class ChangeReturn {
    private static DecimalFormat df2 = new DecimalFormat(".##");

    public static void quarterCalculator(double change) {
        double quarter = 0.25;
        int number_quarters = (int)(change / quarter);
        System.out.println("Number of Quarters: " + number_quarters);

        if(change % quarter == 0)
            return;

        change = change % quarter;
        System.out.println("Change left: " + df2.format(change));
        dimeCalculator(change);
    }

    public static void dimeCalculator(double change) {
        double dime = 0.10;
        int number_dimes = (int)(change / dime);
        System.out.println("Number of Dimes: " + number_dimes);

        if(change % dime == 0)
            return;

        change = change % dime;
        System.out.println("Change left: " + df2.format(change));
        nickelCalculator(change);
    }

    public static void nickelCalculator(double change) {
        double nickel = 0.05;
        int number_nickels = (int)(change / nickel);
        System.out.println("Number of Nickels: " + number_nickels);

        if(change % nickel == 0)
            return;

        change = change % nickel;
        System.out.println("Change left: " + df2.format(change));
        System.out.println("Number of Pennies: " + (int)(change*100));
    }

    public static void changeCalculator(double change) {
        if(change < 0.25)
            dimeCalculator(change);
        quarterCalculator(change);
    }

    public static void main(String[] args) {
        double billAmount, paidAmount, change = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the bill amount: ");
        billAmount = sc.nextDouble();

        System.out.print("Enter the amount paid: ");
        paidAmount = sc.nextDouble();

        if(billAmount <= paidAmount) {
            change = paidAmount - billAmount;
            System.out.println("Change: " + df2.format(change) + "\n");
        }
        if(change > 0)
            changeCalculator(change);
    }
}
