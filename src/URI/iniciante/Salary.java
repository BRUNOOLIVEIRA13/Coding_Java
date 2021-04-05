package URI.iniciante;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        int number;
        int hours;
        double remuneration;
        double salary;
        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Enter your employee number: ");
            number = scan.nextInt();

            System.out.print("Enter the total amount of hours worked last month: ");
            hours = scan.nextInt();

            System.out.print("Type how much you got per hour: ");
            remuneration = scan.nextDouble();
        }

        salary = hours * remuneration;
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", salary);

    }
}
