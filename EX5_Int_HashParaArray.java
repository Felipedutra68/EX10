package EX10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX5_Int_HashParaArray {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        ArrayList<Integer> listaDeNomes = new ArrayList<>();

        for (int i = 1; i <= 7; i++) {

            System.out.println("Digite um numero");
            int n1 = teclado.nextInt();
            set.add(n1);
        }

        for (Integer nome : set) {

            listaDeNomes.add(nome);
        }

        for (Integer nome2 : listaDeNomes) {

            System.out.println(nome2);
        }
    }

}
