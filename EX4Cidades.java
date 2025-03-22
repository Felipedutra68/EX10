package EX10;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX4Cidades {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        java.util.HashSet<String> set = new java.util.HashSet<>();

        for (int i = 1; i <= 7; i++) {

            System.out.println("Digite uma cidade");
            String n1 = teclado.nextLine();
            set.add(n1);
        }

        boolean e1 = set.isEmpty();
        System.out.println("Esta lista esta vazia? " + e1);

    }
}
