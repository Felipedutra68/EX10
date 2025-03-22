package EX10;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX2Frutas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        java.util.HashSet<String> frutas = new java.util.HashSet<>();

        frutas.add("Maca");
        frutas.add("Banana");
        frutas.add("Laranja");

        System.out.println("Uma fruta que voce quer retirar");
        String n1 = teclado.nextLine();

        frutas.remove(n1);

        for (String nome : frutas) {

            System.out.println(nome);
        }

    }
}
