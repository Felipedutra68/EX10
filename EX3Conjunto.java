package EX10;

/**
 *
 * @author ADM
 */
public class EX3Conjunto {
    
 public static void main(String[] args) {

        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
       
        set.removeAll(set); 
       
        
         for (Integer nome : set) {

            System.out.println(nome);
        }
        
 }
}
