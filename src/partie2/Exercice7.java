package partie2;

import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
    	 try (Scanner sc = new Scanner(System.in)) {

        System.out.print("Entrer la taille: ");
        int n = sc.nextInt();

        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            tab[i] = sc.nextInt();
        }

        int max = tab[0];

        for (int i = 1; i < n; i++) {
            if (tab[i] > max)
                max = tab[i];
        }

        System.out.println("Max = " + max);
    }
    }
}