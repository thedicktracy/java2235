package com.cabrerap5rev2;

import javafx.collections.ObservableArray;

public class car  {

    private int key;
    private int uniq;
    private int year;
    private String make;
    private String model;

    //int key, int uniqueid, int year, String make, String model;
    public car(int key, int uniq, int year, String make, String model) {
        this.key = key;
        this.uniq = uniq;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setUniq(int uniq) {
        this.uniq = uniq;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getKey() {
        return key;
    }

    public int getUniq() {
        return uniq;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}

