package HackerRank.desafios;

import java.util.Scanner;

/**
 * Given a string, S , of length N that is indexed from 0 to N - 1,
 * print its even-indexed and odd-indexed characters as 2 space-separated strings
 * on a single line.
 * @author Bruno
 */

public class Day06Strings {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int cases = scan.nextInt();

        for(int c = 0; c < cases; c++) {
            String even, odd;
            even = odd = "";

            String myString = scan.next();
            char[] charArray = myString.toCharArray();

            for (int i = 0; i < charArray.length; i += 2) {
                even += charArray[i];
            }

            for (int j = 1; j < charArray.length; j += 2) {
                odd += charArray[j];
            }

            System.out.println(even + " " + odd);
        }
        scan.close();
    }
}
