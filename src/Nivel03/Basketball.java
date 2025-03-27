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
        double euroLiga= 75;
        double barçaMadrid = 75;
        double finalPrice = initialPrice;

        if (this.competition.equalsIgnoreCase("Euroliga")) {
            finalPrice += euroLiga;
        }
        if (this.club.equalsIgnoreCase("Barcelona") || this.club.equalsIgnoreCase("Madrid")) {
            finalPrice += barçaMadrid;
        }
        return finalPrice;
    }
    @Override
    public int calculateRating(){
        int initialRating = 4;
        int euroLiga = 3;
        int acb = 2;
        int barçaMadrid = 1;
        int finalRating = initialRating;

        if(this.competition.equalsIgnoreCase("Euroliga")){
            finalRating += euroLiga;
        }
        if(this.competition.equalsIgnoreCase("ACB")){
            finalRating += acb;
        }
        if(this.club.equalsIgnoreCase("Barcelona") || this.club.equalsIgnoreCase("Madrid")){
            finalRating += barçaMadrid;
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
