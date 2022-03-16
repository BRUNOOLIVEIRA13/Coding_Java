package HackerRank.exercicios.intro;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class D10JavaCurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // code
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);

        Locale localeIndia = new Locale("en", "IN");
        String india = NumberFormat.getCurrencyInstance(localeIndia).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
