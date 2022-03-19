package HackerRank.datastructures.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C1001ArrayOfString {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine().toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i == j) {
                    System.out.print(Character.toUpperCase(s.charAt(j)));
                } else {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.print(", ");
        }

    }
}
