package HackerRank.desafios;

import java.util.*;

/**
 * @Author: Bruno
 * Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip),
 * and tax percent (the percentage of the meal price being added as tax) for a meal,
 * find and print the meal's total cost. Round the result to the nearest integer.
 */

public class Day02ArithmeticOperators {

    static void solve(double mealCost, double tipPercent, double taxPercent) {
        double totalCost;
        tipPercent = mealCost / 100 * tipPercent;
        taxPercent = mealCost / 100 * taxPercent;
        totalCost = mealCost + tipPercent + taxPercent;
        System.out.println(Math.round(totalCost));

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        double mealCost = scan.nextDouble();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tipPercent = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int taxPercent = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(mealCost, tipPercent, taxPercent);

        scan.close();
    }
}
