package Nivel03;

import java.util.Scanner;

public class NewsManager {
    private final Scanner scanner;

    public NewsManager() {
        this.scanner = new Scanner(System.in);
    }

    public News createNews() {
        System.out.println("\nSelect the type of news to create:");
        System.out.println("1. Football News");
        System.out.println("2. Basketball News");
        System.out.println("3. F1 News");
        System.out.println("4. Tennis News");
        System.out.println("5. Motorcycle News");
        System.out.println("6. General News");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                return createFootballNews();
            case 2:
                return createBasketballNews();
            case 3:
                return createF1News();
            case 4:
                return createTennisNews();
            case 5:
                return createMotorcycleNews();
            default:
                System.out.println("Invalid option. No news created.");
                return null;
        }
    }

    private Football createFootballNews() {
        System.out.println("Enter the title:");
        String title = scanner.nextLine();

        System.out.println("Enter the content:");
        String text = scanner.nextLine();

        System.out.println("Enter the competition:");
        String competition = scanner.nextLine();

        System.out.println("Enter the club:");
        String club = scanner.nextLine();

        System.out.println("Enter the highlighted player:");
        String player = scanner.nextLine();

        return new Football(title, text, competition, club, player);
    }

    private Basketball createBasketballNews() {
        System.out.println("Enter the title:");
        String title = scanner.nextLine();

        System.out.println("Enter the content:");
        String text = scanner.nextLine();

        System.out.println("Enter the competition:");
        String competition = scanner.nextLine();

        System.out.println("Enter the team:");
        String team = scanner.nextLine();

        return new Basketball(title, text, competition, team);
    }

    private F1 createF1News() {
        System.out.println("Enter the title:");
        String title = scanner.nextLine();

        System.out.println("Enter the content:");
        String text = scanner.nextLine();

        System.out.println("Enter the race:");
        String race = scanner.nextLine();

        System.out.println("Enter the scuderia:");
        String scuderia = scanner.nextLine();

        return new F1(title, text, race, scuderia);
    }

    private Tennis createTennisNews() {
        System.out.println("Enter the title:");
        String title = scanner.nextLine();

        System.out.println("Enter the content:");
        String text = scanner.nextLine();

        System.out.println("Enter the competition:");
        String competition = scanner.nextLine();

        System.out.println("Enter the highlighted player:");
        String player = scanner.nextLine();



        return new Tennis(title, text, competition, player);
    }

    private Motorcycle createMotorcycleNews() {
        System.out.println("Enter the title:");
        String title = scanner.nextLine();

        System.out.println("Enter the content:");
        String text = scanner.nextLine();

        System.out.println("Enter the team:");
        String team = scanner.nextLine();

        return new Motorcycle(title, text, team);
    }
}
