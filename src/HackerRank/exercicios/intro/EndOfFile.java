package HackerRank.exercicios.intro;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            int n = 1;
            while(scan.hasNext()) {

                String text = scan.nextLine();
                System.out.println(n + " " + text);
                n++;
            }
        }
    }
}