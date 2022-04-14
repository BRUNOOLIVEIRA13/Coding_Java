package HackerRank.datastructures.strings;

import java.io.*;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class P1006TimeConversion {

    public static String timeConversion(String s) {
        //code here
        LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);

        return s;
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