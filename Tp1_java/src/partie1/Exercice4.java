package partie1;

import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {

        System.out.print("Entrer N: ");
        int n = sc.nextInt();

        int i = 1, somme = 0;

        while (i <= n) {
            somme += i;
            i++;
        }

        System.out.println("Somme = " + somme);
    	}
    }
}