package HackerRank.datastructures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class P1005MiniMaxSumArray {
    /**
     *  Find the minimum and maximum values that can be calculated by summing exactly four of the five integers
     */
    public static void miniMaxSum(List<Integer> arr) {
        long min = arr.get(0);
        long max = min;
        long sum = min;

        for (int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);

            if(arr.get(i) < min) {
                min=arr.get(i);
            }

            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        System.out.print((sum - max) + " " + (sum - min));
    }
}

class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            P1005MiniMaxSumArray.miniMaxSum(arr);
        }
    }
}