package partie3;

import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
    	 try (Scanner sc = new Scanner(System.in)) {

        int[][] mat = new int[3][3];
        int[][] trans = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                trans[j][i] = mat[i][j];
            }
        }

        System.out.println("Transposée:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
    }
}
