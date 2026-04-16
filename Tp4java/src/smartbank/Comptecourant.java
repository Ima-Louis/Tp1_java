package smartbank;

public class Comptecourant extends Compte {
		    private double decouvertMax;

		    public Comptecourant(String numero, String titulaire, double solde, double decouvertMax) {
		        super(numero, titulaire, solde);
		        
		        this.decouvertMax = decouvertMax;
		    }

		  
		    public void retirer(double montant) {
		        if (montant > 0 && solde - montant >= -decouvertMax) {
		            solde -= montant;
		            System.out.println("Retrait OK (découvert autorisé)");
		        } else {
		            System.out.println("Découvert max dépassé!");
		        }
		    }

		    
		    public void afficher() {
		        super.afficher();
		        System.out.println(" Découvert max: " + decouvertMax + "€");
		    }
		}