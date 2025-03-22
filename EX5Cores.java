package EX10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX5Cores {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        java.util.HashSet<String> set = new java.util.HashSet<>();

        ArrayList<String> listaDeNomes = new ArrayList<>();

        for (int i = 1; i <= 7; i++) {

            System.out.println("Digite uma cor");
            String n1 = teclado.nextLine();
            set.add(n1);
        }

        for (String nome : set) {

            listaDeNomes.add(nome);
        }

        for (String nome2 : listaDeNomes) {

            System.out.println(nome2);
        }
    }
}
