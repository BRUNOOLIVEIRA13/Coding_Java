package HackerRank.datastructures.arrays;


import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    static List<Integer> reverseArray(List<Integer> array) {
        int start = 0;
        int end = array.size();
        for (int i = 0; i < end/2; ++i) {
            start = array.get(end - i - 1);
            array.set(end - i - 1, array.get(i));
            array.set(i, start);
        }
        return array;
    }
}


public class P1002ReverseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //ENV of HackerRank challenge
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {

            // Usage with output env for limit the length of the array.
            int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> res = Result.reverseArray(arr);

            bufferedWriter.write(
                    res.stream()
                            .map(Object::toString)
                            .collect(joining(" "))
                            + "\n"
            );

            bufferedReader.close();
        }
    }
}
