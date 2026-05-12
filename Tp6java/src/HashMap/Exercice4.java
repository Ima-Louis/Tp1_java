package HashMap;


	import java.util.*;

	public class Exercice4 {
	    public static void main(String[] args) {
	        HashMap<String, Double> notes = new HashMap<>();
	        notes.put("Ali", 12.5);
	        notes.put("Sara", 15.0);
	        notes.put("Omar", 14.0);

	        System.out.println("Toutes les notes : " + notes);
	        System.out.println("Note de Sara : " + notes.get("Sara"));

	        notes.put("Ali", 13.0);
	        notes.remove("Omar");

	       
	        double somme = 0;
	        for (double n : notes.values()) somme += n;
	        double moyenne = somme / notes.size();
	        System.out.println("Moyenne générale : " + moyenne);
	    }
	}
