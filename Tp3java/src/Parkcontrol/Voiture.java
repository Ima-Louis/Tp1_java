package Parkcontrol;

public class Voiture extends Vehicule{
	private int nbPortes;
	public Voiture(String matricule,String marque,int nbPortes) {
		super(matricule, marque);
		this.nbPortes=nbPortes;
	}
	
	public void stationner() {
		System.out.println("la voiture se gare dans une place standard. ");
	}
	
	public void afficher() {
		
		super.afficher();
		System.out.println("Le nombre de portes"+ nbPortes);
	
	}	

}
