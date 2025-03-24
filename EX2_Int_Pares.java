package EX10;

/**
 *
 * @author ADM
 */
public class EX2_Int_Pares {
    
 public static void main(String[] args) {

        java.util.HashSet<Integer> set = new java.util.HashSet<>();

        int c = 0;

        for (int i = 1; i <= 10; i++) {

            c++;
            if (c % 2 != 0) {
                set.add(c);
            }
        }

        for (Integer nome2 : set) {

            System.out.println(nome2);
        }

    }    
    
    
    

}
