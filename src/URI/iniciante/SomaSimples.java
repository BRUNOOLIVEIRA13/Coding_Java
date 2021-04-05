package URI.iniciante;

import java.util.Scanner;

/**
 * Leia dois valores inteiros, no caso para variáveis A e B.
 * A seguir, calcule a soma entre elas e atribua à variável SOMA.
 * A seguir escrever o valor desta variável.
 */


public class SomaSimples {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        int SOMA = a + b;

        System.out.println("SOMA = " + SOMA);

    }

}
