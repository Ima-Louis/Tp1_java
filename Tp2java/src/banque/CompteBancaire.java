package banque;
public class CompteBancaire {

   
    private int numero;
    private String titulaire;
    private double solde;
    private double decouvertAutorise;

   
    private static int nbComptes = 0;
    private static double tauxInteret = 0.03;

    
    public CompteBancaire() {
        this.numero = ++nbComptes;
        this.titulaire = "Inconnu";
        this.solde = 0;
        this.decouvertAutorise = 0;
    }

   
    public CompteBancaire(String titulaire, double solde, double decouvertAutorise) {
        this.numero = ++nbComptes;
        this.titulaire = titulaire;
        this.solde = solde;
        this.decouvertAutorise = decouvertAutorise;
    }

   
    public String getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(String titulaire) {
        if (titulaire != null && !titulaire.isEmpty()) {
            this.titulaire = titulaire;
        }
    }

    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public void setDecouvertAutorise(double decouvertAutorise) {
        if (decouvertAutorise >= 0) {
            this.decouvertAutorise = decouvertAutorise;
        }
    }

   
    public void afficher() {
        System.out.println("Numéro: " + numero);
        System.out.println("Titulaire: " + titulaire);
        System.out.println("Solde: " + solde);
        System.out.println("Découvert autorisé: " + decouvertAutorise);
    }

    
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        } else {
            System.out.println("Montant de dépôt invalide.");
        }
    }

    
    public void retirer(double montant) {
        if (montant > 0 && solde - montant >= -decouvertAutorise) {
            solde -= montant;
            System.out.println("Retrait autorisé");
        } else {
            System.out.println("Retrait refusé");
        }
    }

  
    public void virementVers(CompteBancaire autre, double montant) {
        if (montant > 0 && solde - montant >= -decouvertAutorise) {
            this.retirer(montant);
            autre.deposer(montant);
        } else {
            System.out.println("Virement impossible : montant ou solde insuffisant.");
        }
    }

    public double calculerSoldeAvecInterets() {
        return solde + (solde * tauxInteret);
    }

  
    public double calculerSoldeAvecInterets(double bonus) {
        return solde + (solde * (tauxInteret + bonus));
    }

    
    public static int getNbComptes() {
        return nbComptes;
    }

    public static double getTauxInteretAnnuel() {
        return tauxInteret;
    }

    public static void setTauxInteretAnnuel(double taux) {
        if (taux >= 0) {
            tauxInteret = taux;
        }
    }
}