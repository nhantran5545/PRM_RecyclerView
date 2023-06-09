package com.example.recyclerview;

public class ItemModel {
    String name, year;
     int poster;

    public ItemModel(String name, String year, int poster) {
        this.name = name;
        this.year = year;
        this.poster = poster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }
}

