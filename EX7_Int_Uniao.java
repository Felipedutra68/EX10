package EX10;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX7_Int_Uniao {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        java.util.HashSet<String> set1 = new java.util.HashSet<>();

        java.util.HashSet<String> set2 = new java.util.HashSet<>();

        java.util.HashSet<String> set3 = new java.util.HashSet<>();

        for (int i = 1; i <= 3; i++) {

            System.out.println("Digite um carro");
            String n1 = teclado.nextLine();
            set1.add(n1);
        }

        for (int i = 1; i <= 3; i++) {

            System.out.println("Digite um carro");
            String n2 = teclado.nextLine();
            set2.add(n2);
        }

        for (String nome1 : set1) {
            
                set3.add(nome1);
        }
        
         for (String nome3 : set2) {
            
                set3.add(nome3);
        }

        for (String nome2 : set3) {

            System.out.println(nome2);

        }
    }

}
