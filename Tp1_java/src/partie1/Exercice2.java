package partie1;

import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
    	 try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Entrer 3 nombres: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("Le plus grand est: " + max);
       }
    }  	  
}