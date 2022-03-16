package HackerRank.datastructures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1001Array1D {

    /**
     * Receive an int[] and print each item per line
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().trim());

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine().trim());
        }
        reader.close();

        for (int j : array) {
            System.out.println(j);
        }
    }
}
