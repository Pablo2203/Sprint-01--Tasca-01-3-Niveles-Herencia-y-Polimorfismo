package Nivel03;

public class Basketball extends News {
    private String competition;
    private String club;

    public Basketball(String title, String text, String competition, String club) {
        super(title, text);
        this.competition = competition;
        this.club = club;
    }
    @Override
    public double calculateNewsPrice(){
        double initialPrice = 250;
        double euroLigaSuplementPrice= 75;
        double barçaMadridSuplementPrice = 75;
        double finalPrice = initialPrice;

        if (this.competition.equalsIgnoreCase("Euroliga")) {
            finalPrice += euroLigaSuplementPrice;
        }
        if (this.club.equalsIgnoreCase("Barcelona") || this.club.equalsIgnoreCase("Madrid")) {
            finalPrice += barçaMadridSuplementPrice;
        }
        return finalPrice;
    }
    @Override
    public int calculateRating(){
        int initialRating = 4;
        int euroLigaRatingBonus = 3;
        int acbRatingBonus = 2;
        int barçaMadridRatingBonus = 1;
        int finalRating = initialRating;

        if(this.competition.equalsIgnoreCase("Euroliga")){
            finalRating += euroLigaRatingBonus;
        }
        if(this.competition.equalsIgnoreCase("ACB")){
            finalRating += acbRatingBonus;
        }
        if(this.club.equalsIgnoreCase("Barcelona") || this.club.equalsIgnoreCase("Madrid")){
            finalRating += barçaMadridRatingBonus;
        }
        return finalRating;
    }

    @Override
    public String toString() {
        return "Basketball{" +
                "competition='" + competition + '\'' +
                ", club='" + club + '\'' +
                '}';
    }
}
