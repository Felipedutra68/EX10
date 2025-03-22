package EX10;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX7Vermelho {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        java.util.HashSet<String> set = new java.util.HashSet<>();

        for (int i = 1; i <= 7; i++) {

            System.out.println("Digite uma cor");
            String n1 = teclado.nextLine();
            set.add(n1);
        }

        if (set.contains("vermelho")) {

            System.out.println("A sequencia contem vermelho");
        } else {
            System.out.println("A sequencia nao contem vermelho");
        }

    }
}
