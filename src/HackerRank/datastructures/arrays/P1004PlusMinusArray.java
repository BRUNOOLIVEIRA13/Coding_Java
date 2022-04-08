package HackerRank.datastructures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Print the ratios of positive, negative and zero values in the array.
 * Each value should be printed on a separate line with 6 digits after the decimal.
 */
public class P1004PlusMinusArray {
    public static void main(String[] args) throws IOException {
        List<Integer> arr;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            arr = Stream.of(
                    bufferedReader.readLine()
                            .replaceAll("\\s+$", "")
                            .split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        }
        Operation.plusMinus(arr);
    }
}

class Operation {
    public static void plusMinus(List<Integer> arr) {
        float positiveRatios = 0;
        float negativeRatios = 0;
        float zeroRatios = 0;

        for(int i = 0; i < arr.size(); i++) {
          if(arr.get(i) > 0) {
              positiveRatios++;
          } else if(arr.get(i) < 0) {
              negativeRatios++;
          } else {
              zeroRatios++;
          }
        }
        positiveRatios /= arr.size();
        negativeRatios /= arr.size();
        zeroRatios /= arr.size();

        System.out.println(positiveRatios);
        System.out.println(negativeRatios);
        System.out.println(zeroRatios);
    }
}
