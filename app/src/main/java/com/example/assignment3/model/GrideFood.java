package com.example.assignment3.model;

public class GrideFood {

    private int id;
    private int img;
    private String foodName;

    public GrideFood(int id, int img, String foodName) {
        this.id = id;
        this.img = img;
        this.foodName = foodName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
