package com.example.corktravelapp;

import java.util.ArrayList;

public class Location {
    String name;
    Integer image;
    public Location(String name, Integer image){
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
