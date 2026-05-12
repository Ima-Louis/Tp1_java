package tp7;


class PaiementException extends Exception {
    public PaiementException(String message) {
        super(message);
    }
}

public class Partie1 {
    public static double effectuerPaiement(double montant, double solde) throws PaiementException {
        if (montant <= 0) {
            throw new PaiementException("Montant invalide : doit être > 0");
        }
        if (montant > solde) {
            throw new PaiementException("Solde insuffisant !");
        }
        return solde - montant;
    }

    public static void main(String[] args) {
        double solde = 200;

        try {
            double nouveauSolde = effectuerPaiement(120, solde);
            System.out.println("Paiement réussi, nouveau solde : " + nouveauSolde);
        } catch (PaiementException e) {
            System.out.println("Erreur de paiement : " + e.getMessage());
        } finally {
            System.out.println("Fin de la transaction");
        }
    }
}
