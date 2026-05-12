package MiniProjet;

import java.util.*;

class Livre {
    String isbn, titre, auteur;
    int annee;

    Livre(String isbn, String titre, String auteur, int annee) {
        this.isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
        this.annee = annee;
    }

  
    public String toString() {
        return "Livre{ISBN=" + isbn + ", titre='" + titre + "', auteur='" + auteur + "', année=" + annee + "}";
    }
}

public class Exercice6 {
    public static void main(String[] args) {
        ArrayList<Livre> livres = new ArrayList<>();
        HashSet<String> categories = new HashSet<>();
        HashMap<String, Livre> emprunts = new HashMap<>();

        
        livres.add(new Livre("001", "Java Basics", "Smith", 2020));
        livres.add(new Livre("002", "Data Structures", "Johnson", 2018));

        categories.add("Informatique");
        categories.add("Programmation");

        
        emprunts.put("Ali", livres.get(0));

        
        for (Livre l : livres) {
            if (l.titre.equalsIgnoreCase("Java Basics")) {
                System.out.println("Livre trouvé : " + l);
            }
        }

        
        livres.removeIf(l -> l.isbn.equals("002"));

        
        System.out.println("Livres disponibles : " + livres);

        
        System.out.println("Catégories : " + categories);
        System.out.println("Emprunts : " + emprunts);
    }
}
