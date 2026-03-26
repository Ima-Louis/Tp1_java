package partie3;

import java.util.Scanner;

public class Exercice9 {
    public static void main(String[] args) {
    	 try (Scanner sc = new Scanner(System.in)) {

        int[][] mat = new int[3][3];

        // saisie de la matrice par l'utilisateur
        System.out.println("Entrer les elements de la matrice 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("mat[" + i + "][" + j + "] = ");
                mat[i][j] = sc.nextInt();
            }
        }

        // calcul de la somme
        int somme = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somme += mat[i][j];
            }
        }

        // affichage du résultat
        System.out.println("Somme des elements = " + somme);
    }
    }
}