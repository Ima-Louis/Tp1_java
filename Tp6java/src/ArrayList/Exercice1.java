package ArrayList;

import java.util.*;

class Etudiant {
    int id;
    String nom;
    double moyenne;

    Etudiant(int id, String nom, double moyenne) {
        this.id =id;
        this.nom= nom;
        this.moyenne= moyenne;
    }

    public String toString() {
        return "Etudiant{id=" + id + ", nom='" +nom + "',moyenne=" + moyenne +"}";
    }
}

public class Exercice1 {
    public static void main(String[] args) {
        ArrayList<Etudiant> etudiants = new ArrayList<>();

       etudiants.add(new Etudiant(1, "Ali", 12.5));
      etudiants.add(new Etudiant(2, "Sara", 15.0));
       etudiants.add(new Etudiant(3, "Youssef", 10.0));
       etudiants.add(new Etudiant(4, "Fatima", 17.5));
       etudiants.add(new Etudiant(5, "Omar", 14.0));

       System.out.println("Liste des étudiants :");
        etudiants.forEach(System.out::println);

        String rechercheNom = "Sara";
        for (Etudiant e : etudiants) {
            if (e.nom.equalsIgnoreCase(rechercheNom)) {
                System.out.println("Trouvé : " + e);
            }
        }

        etudiants.removeIf(e -> e.id == 3);
        etudiants.sort(Comparator.comparingDouble(e -> e.moyenne));
        Etudiant meilleur = Collections.max(etudiants, Comparator.comparingDouble(e -> e.moyenne));
        System.out.println("Meilleure moyenne : " + meilleur);
    }
}
