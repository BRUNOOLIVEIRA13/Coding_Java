package URI.iniciante;

import java.util.Scanner;

public class Diferrence {

    public static void main(String[] args) {

        int A;
        int B;
        int C;
        int D;
        int formulaCalculo;
        try (Scanner scan = new Scanner(System.in)) {

            A = scan.nextInt();
            B = scan.nextInt();
            C = scan.nextInt();
            D = scan.nextInt();
        }

        formulaCalculo = ( A * B ) - ( C * D );
        System.out.println("DIFERENCA = " + formulaCalculo);

    }
}
