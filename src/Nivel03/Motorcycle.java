package Nivel03;

public class Motorcycle extends News{
    private String team;

    public Motorcycle(String title, String text, String team) {
        super(title, text);
        this.team = team;
    }
    @Override
    public double calculateNewsPrice(){
        double initialPrice = 100;
        double hondaYamaha = 50;
        double finalPrice = initialPrice;
        if (this.team.equalsIgnoreCase("Honda") || this.team.equalsIgnoreCase("Yamaha")) {
            finalPrice += hondaYamaha;
        }
        return finalPrice;
    }

    @Override
    public int calculateRating(){
        int initialRating = 4;
        int hondaYamaha = 3;
        int finalRating = initialRating;
        if (this.team.equalsIgnoreCase("Honda") || this.team.equalsIgnoreCase("Yamaha")) {
            finalRating += hondaYamaha;
        }
        return finalRating;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "team='" + team + '\'' +
                '}';
    }
}

