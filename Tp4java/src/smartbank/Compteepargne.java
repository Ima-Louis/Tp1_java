package smartbank;


	public class Compteepargne extends Compte {
		    private double taux;

		    public Compteepargne(String numero, String titulaire, double solde, double taux) {
		        super(numero, titulaire, solde);
		        this.taux = taux;
		    }

		    public void calculerInterets() {
		        double interets = solde * taux / 100;
		        solde += interets;
		        System.out.println("Intérêts ajoutés: +" + interets + "€");
		    }

		    
		    public void retirer(double montant) {
		        if (solde >= montant) {
		            super.retirer(montant);
		        } else {
		            System.out.println("Retrait interdit (épargne)!");
		        }
		    }
		}