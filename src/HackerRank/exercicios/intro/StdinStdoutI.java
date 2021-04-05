package HackerRank.exercicios.intro;

import java.io.BufferedReader;
import java.util.Scanner;

public class StdinStdoutI {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        try (Scanner scan = new Scanner(System.in)) {

            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();

            scan.close();
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
