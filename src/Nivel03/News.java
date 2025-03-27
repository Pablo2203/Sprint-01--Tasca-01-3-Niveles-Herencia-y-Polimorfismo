package Nivel03;

import java.util.ArrayList;

abstract class News {
    private String title;
    private String text;
    private int rating;
    private double price;
    private ArrayList<Editors> editorsList;

    public News(String title, String text) {
        this.title = title;
        this.text = text;
        this.rating = rating;
        this.price = price;
        this.editorsList = new ArrayList<>();


    }
    public void addEditor(Editors editors) {
        this.editorsList.add(editors);
    }

    public void removeEditor(Editors editors) {
        this.editorsList.remove(editors);
    }

    public ArrayList<Editors> getEditorsList() {
        return editorsList;
    }

    public abstract double calculateNewsPrice();

    public abstract int calculateRating();

    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", rating=" + rating +
                ", price=" + price +
                ", editorsList=" + editorsList +
                '}';
    }
}
