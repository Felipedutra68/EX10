package EX10;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class EX3_Int_1A10 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        java.util.HashSet<Integer> set1 = new java.util.HashSet<>();

        java.util.HashSet<Integer> set2 = new java.util.HashSet<>();

        java.util.HashSet<Integer> set3 = new java.util.HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        set1.add(7);
        set1.add(8);
        set1.add(9);
        set1.add(10);

        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        set2.add(10);
        set2.add(11);
        set2.add(12);
        set2.add(13);
        set2.add(14);
        set2.add(15);

        for (Integer nome1 : set1) {
            if (set2.contains(nome1)) {
                set3.add(nome1);

            }
        }

        for (Integer nome2 : set3) {

            System.out.println(nome2);

        }
    }

}
