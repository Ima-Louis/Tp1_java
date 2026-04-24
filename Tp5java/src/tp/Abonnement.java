package tp;

public abstract class Abonnement {
    private String nom;
    private double prixBase;
    private int nbProfils;
   
    public Abonnement(String nom, double prixBase, int nbProfils) {
        this.nom = nom;
        this.prixBase = (prixBase <= 0) ? 50 : prixBase;
        this.nbProfils = (nbProfils <= 0) ? 1 : nbProfils;
    }
  
    public String getNom() { return nom; }
    public double getPrixBase() { return prixBase; }
    public int getNbProfils() { return nbProfils; }

    public void setNom(String nom) { this.nom = nom; }
    public void setPrixBase(double prixBase) {
        this.prixBase = (prixBase <= 0) ? 50 : prixBase;
    }
    public void setNbProfils(int nbProfils) {
        this.nbProfils = (nbProfils <= 0) ? 1 : nbProfils;
    }

  
    public boolean estPartageFamilial() {
        return nbProfils >= 3;
    }

    public void afficherInfos() {
        System.out.println("Nom: " + nom);
        System.out.println("Prix base: " + prixBase);
        System.out.println("Nb profils: " + nbProfils);
        System.out.println("Partage familial: " + estPartageFamilial());
    }
    public abstract double calculerCoutMensuel();
    public abstract int calculerScoreSatisfaction();
}
