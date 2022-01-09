package com.example.assignment3.model;

public class Cardmodel {

    private int id;
    private String planet;
    private String distance;
    private String surface;
    private String diameter;

    public Cardmodel(int id, String planet, String distance, String surface, String diameter) {
        this.id = id;
        this.planet = planet;
        this.distance = distance;
        this.surface = surface;
        this.diameter = diameter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }
}
