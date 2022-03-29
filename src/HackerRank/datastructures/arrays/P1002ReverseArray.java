package HackerRank.datastructures.arrays;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    static List<Integer> reverseArray(List<Integer> array) {
        int aux = 0;
        int length = array.size();

        for (int i = 0; i < length/2; i++) {
            aux = array.get(length - i - 1);
            array.set(length - i - 1, array.get(i));
            array.set(i, aux);
            System.out.println(i);
        }
        return array;
    }

    // Alternative method
    static List<Integer> reverseArrayAlternative(List<Integer> array) {
        List<Integer> reversedArray = new ArrayList<>();

        for(int i = array.size() - 1; i >= 0; i--) {
          reversedArray.add(array.get(i));
        }
        return reversedArray;
    }

    // Método Recursivo
    static void reverseArrayRecursive(List<Integer> array) {
        // Condição base de parada da recursão
        if(array == null || array.size() <= 1) return;
        // Operação
        Integer x = array.remove(0);
        // Recursão
        reverseArrayRecursive(array);
        // Retorno — Fim da Recursão
        array.add(x);
    }
}


public class P1002ReverseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> res = Result.reverseArrayAlternative(arr);
//            Result.reverseArrayRecursive(arr);

            bufferedWriter.write(
                    res.stream()
                            .map(Object::toString)
                            .collect(joining(" "))
                            + "\n"
            );

//            Para fins didáticos se quiser usar com a recursão:
//            bufferedWriter.write(
//                    arr.stream()
//                            .map(Object::toString)
//                            .collect(joining(" "))
//                            + "\n"
//            );

            bufferedReader.close();
        }
    }
}
