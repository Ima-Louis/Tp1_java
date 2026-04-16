package smartbank;

public class Compte {
    protected String numero;
    protected String titulaire;
    protected double solde;

    public Compte(String numero, String titulaire, double solde) {
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt OK: +" + montant + "€");
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && solde >= montant) {
            solde -= montant;
            System.out.println("Retrait OK: -" + montant + "€");
        } else {
            System.out.println("Solde insuffisant!");
        }
    }

    public void afficher() {
        System.out.printf("Compte %s - %s : %.2f€%n", numero, titulaire, solde);
    }
}

