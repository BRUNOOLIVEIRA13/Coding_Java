package URI.iniciante;

import java.util.Scanner;

public class SalaryWithBonus {

    public static void main(String[] args) {

        String nome;
        double salary;
        double sales;
        double amountMoney;
        double tax = 0.15;
        try (Scanner scan = new Scanner(System.in)) {

            System.out.print("Tell me what is your name: ");
            nome = scan.next();

            System.out.print("Type your minimum wage: ");
            salary = scan.nextDouble();

            System.out.print("How much money you made with sale: ");
            sales = scan.nextDouble();
        }

        amountMoney = (sales * tax) + salary;
        System.out.printf("TOTAL = R$ %.2f%n", amountMoney);


    }
}
