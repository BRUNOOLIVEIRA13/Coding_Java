package HackerRank.datastructures.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1005StringAnagram {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String firstInput = reader.readLine().toLowerCase();
            String secondInput = reader.readLine().toLowerCase();

            char[] firstInputList = firstInput.toCharArray();
            char[] secondInputList = secondInput.toCharArray();
            Arrays.sort(firstInputList);
            Arrays.sort(secondInputList);

            boolean isAnagram = Arrays.equals(firstInputList, secondInputList);

            System.out.println(isAnagram ? "Anagrams" : "Not Anagrams");
        }
    }
}
