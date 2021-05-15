package HackerRank.desafios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Given an integer n, print its first 10 multiples.
 * <p>
 * Each multiple n x i (where 1 <= i <= 10) SHOULD be printed on a new line in the form:
 *  n x i = result
 * <p>
 * See also: https://www.hackerrank.com/challenges/30-loops/problem
 * <p>
 * @author Bruno
 * @version 1.0.0
 */

public class Day05Loops {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
        bufferedReader.close();
    }
}
