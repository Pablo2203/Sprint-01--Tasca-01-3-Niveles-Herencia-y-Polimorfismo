package Nivel03;

public class Tennis extends News {
    private String competition;
    private String player;

    public Tennis(String title, String text, String competition, String player) {
        super(title,text);
        this.competition = competition;
        this.player = player;
    }
    @Override
    public double calculateNewsPrice() {
        double initialPrice = 150;
        double federerNadalDjokovicSuplementPrice = 100;
        double finalPrice = initialPrice;

        if (this.player.equalsIgnoreCase("Federer") || this.player.equalsIgnoreCase("Nadal") || this.player.equalsIgnoreCase("Djokovic")) {
            finalPrice += federerNadalDjokovicSuplementPrice;
        }
        return finalPrice;
    }
    @Override
    public int calculateRating() {
        int initialRating = 4;
        int federerNadalDjokovicBonusRating = 3;
        int finalRating = initialRating;
        if (this.player.equalsIgnoreCase("Federer") || this.player.equalsIgnoreCase("Nadal") || this.player.equalsIgnoreCase("Djokovic")) {
            finalRating += federerNadalDjokovicBonusRating;
        }
        return finalRating;
    }

    @Override
    public String toString() {
        return "Tennis{" +
                "competition='" + competition + '\'' +
                ", player='" + player + '\'' +
                '}';
    }
}

