package Nivel03;

public class Football extends News{
    private String competition;
    private String club;
    private String player;

    public Football(String title, String text, String competition, String club, String player) {
        super(title, text);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }
    @Override
    public double calculateNewsPrice() {
        double initialPrice = 300;
        double championsSuplementPrice = 100;
        double barçaMadridSuplementPrice = 100;
        double ferranTorresOBenzemaSuplementPrice = 50;
        double finalPrice = initialPrice;

        if (this.competition.equalsIgnoreCase("Liga de Campeones")) {
            finalPrice += championsSuplementPrice;
        }
        if (this.club.equalsIgnoreCase("Barcelona") || this.club.equalsIgnoreCase("Madrid")) {
            finalPrice += barçaMadridSuplementPrice;
        }
        if (this.player.equalsIgnoreCase("Benzema") || this.player.equalsIgnoreCase("Ferran Torres")) {
            finalPrice += ferranTorresOBenzemaSuplementPrice;
        }
        return finalPrice;
    }

    @Override
    public int calculateRating() {
        int initialRating = 5;
        int ligaDeCampeonesRatingBonus = 3;
        int ligaRatingBonus = 2;
        int barçaMadridRatingBonus = 1;
        int ferranTorresOBenzemaRatingBonus = 1;
        int finalRating = initialRating;

        if (this.competition.equalsIgnoreCase("Liga de Campeones")) {
            finalRating += ligaDeCampeonesRatingBonus;
        }
        if (this.competition.equalsIgnoreCase("Liga")) {
            finalRating += ligaRatingBonus;
        }
        if (this.club.equalsIgnoreCase("Barcelona") || this.club.equalsIgnoreCase("Madrid")) {
            finalRating += barçaMadridRatingBonus;
        }
        if (this.player.equalsIgnoreCase("Benzema") || this.player.equalsIgnoreCase("Ferran Torres")) {
            finalRating += ferranTorresOBenzemaRatingBonus;
        }

        return finalRating;
    }

    @Override
    public String toString() {
        return "Football{" +
                "competition='" + competition + '\'' +
                ", club='" + club + '\'' +
                ", player='" + player + '\'' +
                '}';
    }
}


