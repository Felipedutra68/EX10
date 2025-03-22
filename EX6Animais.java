package EX10;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX6Animais {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        java.util.HashSet<String> set = new java.util.HashSet<>();

        set.add("Cachorro");
        set.add("Cavalo");
        set.add("Onca");

        System.out.println("Digite um animal");
        String n1 = teclado.nextLine();

        if (set.contains(n1)) {

            System.out.println("A sequencia contem " + n1);
        } else {
            System.out.println("A sequencia nao contem " + n1);
        }

    }
}
