package tp7;

public class Partie4 {
    public static double lireTransaction(double[] tab, int index) {
        return tab[index];   }

  public static void main(String[] args) {
        double[] transactions = {100.0, 200.0, 300.0};

          try {
            double valeur = lireTransaction(transactions, 5); 
              System.out.println("Transaction : " + valeur);
      } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur : indice invalide !");
        } catch (NullPointerException e) {
            System.out.println("Erreur : tableau non initialisé !");
   }
    }
}
