package HackerRank.desafios;

import java.util.Scanner;

/**
 * @Author:Bruno
 * If  is odd, print Weird
 * If  is even and in the inclusive range of  to , print Not Weird
 * If  is even and in the inclusive range of  to , print Weird
 * If  is even and greater than , print Not Weird
 */

public class ConditionalStatements {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if (N%2 == 1 || N > 5 && N < 21) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

    }
}

