package EX10;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX8SP {
    
 public static void main(String[] args) {
    
  Scanner teclado = new Scanner(System.in);

        java.util.HashSet<String> set = new java.util.HashSet<>();
        
        set.add("Sao Paulo");
        set.add("Minas");
        set.add("Porto Alegre");
        set.add("Inbe");
        
        if(set.contains("Sao Paulo")) {
    
        System.out.println("A sequencia contem Sao Paulo");
    }else{
     System.out.println("A sequencia nao contem Sao Paulo");
    }
        
        
 }
}
