package HackerRank.exercicios.intro;

import java.util.*;

public class LoopsII {

    public static void main(String []argh) {

        Scanner scanner = new Scanner(System.in);

        int queries = scanner.nextInt();

        for(int i = 0; i < queries; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            for(int j = 0; j < n; j++){
                a += Math.pow(2, j) * b;
                System.out.print(a + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}