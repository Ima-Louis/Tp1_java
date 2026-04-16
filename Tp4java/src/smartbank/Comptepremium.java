package smartbank;

public class Comptepremium extends Compte {
	    private double plafond;

	    public Comptepremium(String numero, String titulaire, double solde, double plafond) {
	        super(numero, titulaire, solde);
	        this.plafond = plafond;
	    }

	  
	    public void retirer(double montant) {
	        if (montant <= plafond) {
	            super.retirer(montant);
	        } else {
	            System.out.println("Montant > plafond " + plafond + "€!");
	        }
	    }
	}