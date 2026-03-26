package partie4;

import java.util.Scanner;

public class Exercice14 {
    public static void main(String[] args) {
    	 try (Scanner sc = new Scanner(System.in)) {

        String s = sc.nextLine();
        String inv = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            inv += s.charAt(i);
        }

        if (s.equals(inv))
            System.out.println("Palindrome");
        else
            System.out.println("Non palindrome");
    }
    }
}
