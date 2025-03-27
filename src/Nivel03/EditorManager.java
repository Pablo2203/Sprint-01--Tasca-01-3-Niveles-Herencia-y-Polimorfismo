package Nivel03;

import java.util.Scanner;

public class EditorManager {
    private Scanner scanner;

    public EditorManager() {
        this.scanner = new Scanner(System.in);
    }

    public Editors createEditor() {
        System.out.println("Introduce editor's name:");
        String name = scanner.nextLine();

        System.out.println("Introduce editor's DNI:");
        String code = scanner.nextLine();

        return new Editors(name, code);
    }

    @Override
    public String toString() {
        return "EditorManager{" +
                "scanner=" + scanner +
                '}';
    }
}