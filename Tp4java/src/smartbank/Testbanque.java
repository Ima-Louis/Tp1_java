package smartbank;

public class Testbanque {
    public static void main(String[] args) {
      
        Compte[] tousLesComptes = {
            new Comptecourant("CC01", "Alice", 1000, 500),
            new Compteepargne("CE01","Bob", 2000,2.5),
            new Comptepremium("CP01","Charlie",5000, 1000),
            new Comptecourant("CC02","Diana", 800, 300)
        };

        System.out.println("TEST POLYMORPHISME \n");
        
       
        for (Compte c : tousLesComptes) {
            System.out.println("---" + c.getClass().getSimpleName() + " ---");
            c.deposer(200);
            c.retirer(300);
            c.afficher();
            System.out.println();
        }

       
        System.out.println(" COMPTES ÉPARGNE\n");
        for (Compte c : tousLesComptes) {
            if (c instanceof Compteepargne) {
                ((Compteepargne) c).calculerInterets();
                c.afficher();
                System.out.println();
            }
        }

      
        System.out.println("DOWNCASTING TEST\n");
        Compte c = new Compteepargne("CE02", "Eve", 1500, 3);
        try {
            Comptecourant cc = (Comptecourant) c; 
        } catch (ClassCastException e) {
            System.out.println("❌ ERREUR: " + e.getMessage());
            System.out.println(" Toujours vérifier instanceof avant!");
        }
    }
}