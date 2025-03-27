package Nivel03;

import Nivel03.News;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuManager {
    private Scanner scanner;
    private EditorManager editorManager;
    private NewsManager newsManager;
    private ArrayList<Editors> editorsList;
    private ArrayList<News> newsList;

    public MenuManager(EditorManager editorManager, NewsManager newsManager) {
        this.scanner = new Scanner(System.in);
        this.editorManager = editorManager;
        this.newsManager = newsManager;
        this.editorsList = new ArrayList<>();
        this.newsList = new ArrayList<>();
    }

    public void showMenu() {
        int option;
        do {
            printMenu();
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> addEditor();
                case 2 -> removeEditor();
                case 3 -> addNewsToEditor();
                case 4 -> removeNews();
                case 5 -> displayAllNews();
                case 6 -> calculateNewsRating();
                case 7 -> calculateNewsPrice();
                case 0 -> System.out.println("Leaving the menu...");
                default -> System.out.println("Invalid option. Try again.");
            }
        } while (option != 0);
    }

    private void printMenu() {
        System.out.println("\nMENÚ:");
        System.out.println("1.- Introducir redactor");
        System.out.println("2.- Eliminar redactor");
        System.out.println("3.- Introducir noticia a un redactor");
        System.out.println("4.- Eliminar noticia (debe pedir redactor y titular de la noticia)");
        System.out.println("5.- Mostrar todas las noticias por redactor");
        System.out.println("6.- Calcular puntuación de la noticia");
        System.out.println("7.- Calcular precio-noticia");
        System.out.println("0.- Salir");
    }

    private void addEditor() {
        Editors editor = editorManager.createEditor();
        editorsList.add(editor);
        System.out.println("Editor added: " + editor);
    }

    private void removeEditor() {
        System.out.println("Introduce the DNI of the editor to remove:");
        String dniToRemove = scanner.nextLine();
        if (editorsList.removeIf(e -> e.getDni().equals(dniToRemove))) {
            System.out.println("Redactor eliminado.");
        } else {
            System.out.println("No se encontró un redactor con ese DNI.");
        }
    }

    private void addNewsToEditor() {
        if (editorsList.isEmpty()) {
            System.out.println("No editors available. Please add some editors first");
            return;
        }
        System.out.println("Choose an editor:");
        for (int i = 0; i < editorsList.size(); i++) {
            System.out.println((i + 1) + ". " + editorsList.get(i).getName());
        }
        int editorIndex = scanner.nextInt() - 1;
        scanner.nextLine();

        if (editorIndex >= 0 && editorIndex < editorsList.size()) {
            News news = newsManager.createNews();
            newsList.add(news);
            editorsList.get(editorIndex).addNews(news);
            System.out.println("News added: " + news);
        } else {
            System.out.println("Índice inválido, intente nuevamente.");
        }
    }

    private void removeNews() {
        System.out.println("Ingrese el título de la noticia a eliminar:");
        String titleToRemove = scanner.nextLine();
        if (newsList.removeIf(n -> n.getTitle().equals(titleToRemove))) {
            System.out.println("Noticia eliminada.");
        } else {
            System.out.println("No se encontró ninguna noticia con ese título.");
        }
    }

    private void displayAllNews() {
        if (newsList.isEmpty()) {
            System.out.println("No hay noticias disponibles.");
        } else {
            System.out.println("Available news:");
            newsList.forEach(System.out::println);
        }
    }

    private void calculateNewsRating() {
        if (newsList.isEmpty()) {
            System.out.println("No news available to calculate rating.");
        } else {
            System.out.println("Puntuación de las noticias:");
            newsList.forEach(n -> System.out.println(n.getTitle() + ": " + n.calculateRating()));
        }
    }

    private void calculateNewsPrice() {
        if (newsList.isEmpty()) {
            System.out.println("No news available to calculate price.");
        } else {
            System.out.println("Precio de las noticias:");
            newsList.forEach(n -> System.out.println(n.getTitle() + ": " + n.calculateNewsPrice()));
        }
    }
}