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
        double federerNadalDjokovic = 100;
        double finalPrice = initialPrice;

        if (this.player.equalsIgnoreCase("Federer") || this.player.equalsIgnoreCase("Nadal") || this.player.equalsIgnoreCase("Djokovic")) {
            finalPrice += federerNadalDjokovic;
        }
        return finalPrice;
    }
    @Override
    public int calculateRating() {
        int initialRating = 4;
        int federerNadalDjokovic = 3;
        int finalRating = initialRating;
        if (this.player.equalsIgnoreCase("Federer") || this.player.equalsIgnoreCase("Nadal") || this.player.equalsIgnoreCase("Djokovic")) {
            finalRating += federerNadalDjokovic;
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

