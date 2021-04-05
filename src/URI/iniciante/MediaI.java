package URI.iniciante;

import java.util.Scanner;

public class MediaI {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble() * (3.5);
        double B = scan.nextDouble() * (7.5);
        double peso = 11;
        scan.close();

        double media = ((A + B) / peso);

        System.out.printf("MEDIA = %.5f%n", media);

    }
}
