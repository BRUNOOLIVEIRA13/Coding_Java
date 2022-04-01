package HackerRank.datastructures.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * Given a string , print YES if it is a palindrome, print NO otherwise.
 */
public class P1004StringPalindrome {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
          String input = reader.readLine().toLowerCase(Locale.ROOT);
          String reverseInput = new StringBuilder(input).reverse().toString();

          boolean isPalindrome = input.compareTo(reverseInput) == 0;

          System.out.println(isPalindrome ? "YES" : "NO");
        }
    }
}
