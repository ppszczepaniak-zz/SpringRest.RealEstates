package com.example.RealEstates.models;

public abstract class AbstractModel {
    protected static int lastId = 0;
    protected int id;

    protected AbstractModel() {
        lastId++; //static so counted for any class that extends this abstract class
        this.id = lastId; //is written for each instance of the class
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }
}