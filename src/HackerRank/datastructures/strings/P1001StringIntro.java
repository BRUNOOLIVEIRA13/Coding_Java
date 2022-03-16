package HackerRank.datastructures.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1001StringIntro {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine().toLowerCase();
        String b = reader.readLine().toLowerCase();

        System.out.println(length(a, b));

        compareLexicographically(a, b);

        System.out.println(capitalize(a) + " " + capitalize(b));

        reader.close();
    }

    public static String length(String a, String b) {
        return String.valueOf((a.length() + b.length()));
    }

    private static void compareLexicographically(String a, String b) {
        if (a.compareTo(b) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static String capitalize(String str) {
        if(str == null || str.isEmpty()) {
            return str;
        }

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
