package Parkcontrol;

public class TestParking {
    public static void main(String[] args) {
 
        Vehicule[] v = new Vehicule[4];

        
        v[0] = new Voiture("A123", "Toyota", 4);
        v[1] = new Voiture("B456", "Renault", 5);
        v[2] = new Moto("C789", "Yamaha", true);
        v[3] = new Camion("D000", "Volvo", 12.5);

       
        System.out.println("=== Tous les véhicules ===");
        for (Vehicule veh : v) {
            veh.stationner();
            veh.afficher();
            System.out.println("------------------");
        }

        
        System.out.println("=== Seulement les voitures ===");
        for (Vehicule veh : v) {
            if (veh instanceof Voiture) {
                veh.afficher();
                System.out.println("------------------");
            }
        }

        
        Vehicule x = new Moto("11C22", "Yamaha", true);
        if (x instanceof Voiture) {
            Voiture v1 = (Voiture) x;
            System.out.println("Downcasting réussi !");
        } else {
            System.out.println("Erreur: impossible de convertir Moto en Voiture !");
        }
    }
}
