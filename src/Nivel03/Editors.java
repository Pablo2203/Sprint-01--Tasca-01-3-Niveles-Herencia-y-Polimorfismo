package Nivel03;

import Nivel03.News;

import java.util.ArrayList;

public class Editors {
    private String name;
    final String dni;
    static double salary;
    private ArrayList<News> newsList;

    public Editors(String name, String dni) {
        this.name = name;
        this.dni = dni;
        salary = 1500;
        this.newsList = new ArrayList<>();
    }
    public void addNews(News news) {
        this.newsList.add(news);
    }
    public void removeNews(News news) {
        this.newsList.remove(news);
    }
    public ArrayList<News> getNewsList() {
        return newsList;
    }
    public String getName() {
        return name;
    }
    public String getDni() {
        return dni;
    }


    @Override
    public String toString() {
        return "Editors{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", newsList=" + newsList +
                '}';
    }
}



