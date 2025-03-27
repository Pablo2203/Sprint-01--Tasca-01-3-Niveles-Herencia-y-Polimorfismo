package Nivel03.Main;


import Nivel03.EditorManager;
import Nivel03.MenuManager;
import Nivel03.NewsManager;

public class Main {
    public static void main(String[] args) {

        EditorManager editorManager = new EditorManager();
        NewsManager newsManager = new NewsManager();
        MenuManager menu = new MenuManager(editorManager, newsManager);

        menu.showMenu();
    }
}


