package HackerRank.desafios;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class PickingTickets {

    // Complete the maxTickets function below.
    static int maxTickets(List<Integer> tickets) {
        Collections.sort(tickets);
        tickets.forEach(ticket -> System.out.print(ticket + " "));
        int inicioDoRange = 1;
        int melhorTamanho = -1;
        int len = tickets.size();

        for (int count = 1; count < len; count++) {
            if (tickets.get(count) - tickets.get(count - 1) > 1) {
                melhorTamanho = Math.max(melhorTamanho, inicioDoRange);
                inicioDoRange = 0;
            }
            else {
                inicioDoRange += 1;
            }
        }
        return Math.max(melhorTamanho, inicioDoRange);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int ticketsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ticketsTemp = new ArrayList<>();

        IntStream.range(0, ticketsCount).forEach(i -> {
            try {
                ticketsTemp.add(bufferedReader.readLine().replaceAll("\\s+$", ""));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> tickets = ticketsTemp.stream()
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int res = maxTickets(tickets);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
