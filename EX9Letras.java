package EX10;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX9Letras {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        java.util.HashSet<String> set = new java.util.HashSet<>();

        for (int i = 1; i <= 7; i++) {

            System.out.println("Digite uma Letra");
            String n1 = teclado.nextLine();
            set.add(n1);
        }

        int tamanho = set.size();

        System.out.println("\nNa nossa lista possuem " + tamanho + " letras");

    }
}
