package Nivel03;

public class F1 extends News {
    private String race;
    private String scuderia;

    public F1(String title, String text, String race, String scuderia) {
        super(title, text);
        this.race = race;
        this.scuderia = scuderia;
    }
    @Override
    public double calculateNewsPrice(){
        double initialPrice = 100;
        double ferrariMercedesSuplementPrice = 50;
        double finalPrice = initialPrice;

        if (this.race.equalsIgnoreCase("Ferrari") || this.race.equalsIgnoreCase("Mercedes")) {
            finalPrice += ferrariMercedesSuplementPrice;
        }
        return finalPrice;
    }
    @Override
    public int calculateRating(){
        int initialRating = 4;
        int ferrariMercedesRatingBonus = 3;
        int finalRating = initialRating;
        if (this.race.equalsIgnoreCase("Ferrari") || this.race.equalsIgnoreCase("Mercedes")) {
            finalRating += ferrariMercedesRatingBonus;
        }
        return finalRating;
    }

    @Override
    public String toString() {
        return "F1{" +
                "race='" + race + '\'' +
                ", scuderia='" + scuderia + '\'' +
                '}';
    }
}
