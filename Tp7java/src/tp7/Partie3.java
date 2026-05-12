package tp7;
public class Partie3 {
public static double lireMontantProp(String valeur) throws NumberFormatException, IllegalArgumentException {
    double montant =Double.parseDouble(valeur);
    if (montant < 0) {
        throw new IllegalArgumentException("Montant négatif interdit !");
    }
    return montant;
}

public static void main(String[] args) {
    try {
         double m = lireMontantProp("-50");
        System.out.println("Montant lu : " + m);
    } catch (NumberFormatException e) {
        System.out.println("Erreur de format : " + e.getMessage());
    } catch (IllegalArgumentException e) {
       System.out.println("Erreur métier : " + e.getMessage());
    }
  }
}
