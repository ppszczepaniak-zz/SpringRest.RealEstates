package com.example.RealEstates.models;

public abstract class AbstractModel {
    protected static int lastId = 0;
    protected int id;

    public AbstractModel(int id) {
        lastId++;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }
}