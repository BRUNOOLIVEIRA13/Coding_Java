package HackerRank.exercicios.intro;

import java.util.Scanner;

public class DataTypes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        for (int i = 0; i < testCases; i++) {

            try {
                long input = scan.nextLong();
                System.out.println(input + " can be fitted in: ");

                if (input>=-128 && input<=127) {
                    System.out.println("* byte");
                }
                if (input>=-32768 && input <= 32767) {
                    System.out.println("* short");
                }
                if (input >=  Math.pow(-2, 31) && input <= Math.pow(2, 31) - 1) {
                    System.out.println("* int");
                }
                if (input >=  Math.pow(-2, 63) && input <= Math.pow(2, 63) - 1) {
                    System.out.println("* long");
                }

            }
            catch(Exception e) {
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }

        }
    }
}