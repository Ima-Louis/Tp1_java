package tp7;
public class Partie2 {
public static double lireMontant(String valeur) {
    try {
      double montant = Double.parseDouble(valeur);
         if (montant < 0) {
            throw new IllegalArgumentException("Montant négatif interdit !");
        }
      return montant;
    } catch (NumberFormatException e) {
        System.out.println("Erreur : valeur non numérique !");
     return 0; 
    } catch (IllegalArgumentException e) {
        System.out.println("Erreur : " + e.getMessage());
         return 0;
    }
}
}
