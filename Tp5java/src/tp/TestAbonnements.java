package tp;

public class TestAbonnements {
    public static void main(String[] args) {

        Abonnement[] abonnements = {
            new AbonnementVideo("Video+", 100, 4, true, true),
            new AbonnementMusique("Music+", 80, 2, 25, true),
            new AbonnementJeux("Game+", 120, 1, 60, 50)
        };

        for (Abonnement a : abonnements) {
            System.out.println("------------");
            a.afficherInfos();
            System.out.println("Cout: " + a.calculerCoutMensuel());
            System.out.println("Score: " + a.calculerScoreSatisfaction());
        }

        System.out.println("\n=== Test Reduction ===");

        Reducible[] reducibles = {
            (Reducible) abonnements[0],
            (Reducible) abonnements[1]
        };

        for (Reducible r : reducibles) {
            System.out.println("20%: " + r.appliquerReduction(20));
            System.out.println("50%: " + r.appliquerReduction(50));
        }
    }
}
