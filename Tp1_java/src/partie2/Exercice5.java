package partie2;

import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
    	 try (Scanner sc = new Scanner(System.in)) {

        System.out.print("Entrer la taille: ");
        int n = sc.nextInt();

        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("tab[" + i + "] = ");
            tab[i] = sc.nextInt();
        }

        System.out.println("Elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(tab[i]);
        }
    }
    }
}
