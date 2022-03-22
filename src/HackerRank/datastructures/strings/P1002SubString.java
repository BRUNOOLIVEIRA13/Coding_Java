package HackerRank.datastructures.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1002SubString {

    /**
     * Given a string,s, and two indices, start and end,
     * print a substring consisting of all characters in the inclusive range from start to end - 1 .
     *  */

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine().replaceAll("(\r\n|[\n\r\u2028\u2029\u0085])?", "").trim();
        int start = Integer.parseInt(reader.readLine());
        int end = Integer.parseInt(reader.readLine());

        substringInclusive(s, start, end);
        reader.close();
    }

    private static void substringInclusive(String s, int start, int end) {
        if (start > s.length() || end > s.length()) {
            System.err.println("Please, try again");
        }
        if (s.length() > (end + 1) ) {
            System.out.println(s.substring(start, end));
        }
    }
}
