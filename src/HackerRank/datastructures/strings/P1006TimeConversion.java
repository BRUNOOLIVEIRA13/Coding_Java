package HackerRank.datastructures.strings;

import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Given a time in -hour AM/PM format, convert it to military (24-hour) time.
 */
public class P1006TimeConversion {

    public static String timeConversion(String s) {
        if (s.endsWith("PM")) {
            if (s.startsWith("12")) {
                return s.substring(0, s.length() - 2);
            } else {
                LocalTime militaryTime = LocalTime.parse(s.substring(0, s.length() - 2)).plusHours(12);

                return militaryTime.format(DateTimeFormatter.ISO_TIME);
            }
        } else {
            if (s.endsWith("AM") && s.startsWith("12")) {
                String newHour = s.replace(s.substring(0, 2), "00");

                return newHour.substring(0, newHour.length() - 2);
            } else {
                return s.substring(0, s.length() - 2);
            }
        }
    }
}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String s = bufferedReader.readLine();

            String result = P1006TimeConversion.timeConversion(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();

            bufferedReader.close();
        }
    }
}