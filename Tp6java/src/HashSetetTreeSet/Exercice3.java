package HashSetetTreeSet;

import java.util.*;

public class Exercice3 {
    public static void main(String[] args) {
        HashSet<String> matieres = new HashSet<>();
        matieres.add("Maths");
        matieres.add("Physique");
        matieres.add("Informatique");
        matieres.add("Maths");

        System.out.println("Matières (HashSet) :" + matieres);

        TreeSet<String> matieresTriees = new TreeSet<>( matieres );
        System.out.println("Matières triées (TreeSet) : " + matieresTriees);
    }
}
