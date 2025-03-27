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
        double champions = 100;
        double barçaMadrid = 100;
        double ferranTorresOBenzema = 50;
        double finalPrice = initialPrice;

        if (this.competition.equalsIgnoreCase("Liga de Campeones")) {
            finalPrice += champions;
        }
        if (this.club.equalsIgnoreCase("Barcelona") || this.club.equalsIgnoreCase("Madrid")) {
            finalPrice += barçaMadrid;
        }
        if (this.player.equalsIgnoreCase("Benzema") || this.player.equalsIgnoreCase("Ferran Torres")) {
            finalPrice += ferranTorresOBenzema;
        }
        return finalPrice;
    }

    @Override
    public int calculateRating() {
        int initialRating = 5;
        int ligaDeCampeones = 3;
        int liga = 2;
        int barçaMadrid = 1;
        int ferranTorresOBenzema = 1;
        int finalRating = initialRating;

        if (this.competition.equalsIgnoreCase("Liga de Campeones")) {
            finalRating += ligaDeCampeones;
        }
        if (this.competition.equalsIgnoreCase("Liga")) {
            finalRating += liga;
        }
        if (this.club.equalsIgnoreCase("Barcelona") || this.club.equalsIgnoreCase("Madrid")) {
            finalRating += barçaMadrid;
        }
        if (this.player.equalsIgnoreCase("Benzema") || this.player.equalsIgnoreCase("Ferran Torres")) {
            finalRating += ferranTorresOBenzema;
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


