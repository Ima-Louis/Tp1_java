package partie2;

import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
    	 try (Scanner sc = new Scanner(System.in)) {

        int[] tab = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("tab[" + i + "] = ");
            tab[i] = sc.nextInt();
        }

        System.out.print("Nombre à chercher: ");
        int x = sc.nextInt();

        boolean trouve = false;

        for (int i = 0; i < 10; i++) {
            if (tab[i] == x) {
                System.out.println("Trouvé à la position: " + i);
                trouve = true;
            }
        }

        if (!trouve)
            System.out.println("Non trouvé");
    }
}
}
