package EX10;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX10Iterar {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        java.util.HashSet<String> set = new java.util.HashSet<>();
        
         set.add("Cachorro");
        set.add("Cavalo");
        set.add("Onca");
        
          for (String nome2 : set) {

            System.out.println(nome2);
        }
        

    }
}
