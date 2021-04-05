package HackerRank.exercicios.intro;

import java.io.*;
import java.time.LocalDate;

/**
 * @author Bruno;
 * Retornar o nome do dia - getDay (Monday, Tuesday, ..., Sunday),
 * dado uma especifica data MM/DD/YYYY;
 */

class Result {

    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day)
                .getDayOfWeek()
                .name();
    }

}


public class DateAndTime {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}