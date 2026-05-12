package TreeMap;

import java.util.*;

public class Exercice5 {
    public static void main(String[] args) {
      TreeMap<Integer, String> classement = new TreeMap<>();
        classement.put(101, "Ali");
        classement.put(99, "Sara");
        classement.put(120, "Omar");

        System.out.println("Classement trié : " + classement);
        System.out.println("Premier : " + classement.firstEntry());
        System.out.println("Dernier : " + classement.lastEntry());

        System.out.println("Numéro > 100 : " + classement.tailMap(100));
    }
}
