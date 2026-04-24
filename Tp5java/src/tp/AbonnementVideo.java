package tp;

public class AbonnementVideo extends Abonnement implements Reducible {
    private boolean optionHD;
    private boolean option4K;

    public AbonnementVideo(String nom, double prixBase, int nbProfils,
                           boolean optionHD, boolean option4K) {
        super(nom, prixBase, nbProfils);
        this.optionHD = optionHD;
        this.option4K = option4K;
    }

    public double calculerCoutMensuel() {
        double cout = getPrixBase();
        if (optionHD) cout += 10;
        if (option4K) cout += 20;
        return cout;
    }

    public int calculerScoreSatisfaction() {
        int score = 60;
        if (optionHD) score += 10;
        if (option4K) score += 20;
        if (getNbProfils() >= 4) score += 10;

        return Math.min(score, 100);
    }

    public boolean estEligibleReduction(double p) {
        return p <= 30;
    }

    public double appliquerReduction(double p) {
        if (estEligibleReduction(p)) {
            return calculerCoutMensuel() * (1 - p / 100);
        }
        return calculerCoutMensuel();
    }
}