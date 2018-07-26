package com.spidermanteam.pizzeriaapp.model;

public class Product {

    private String id;
    private String name;
    private String description;
    private String size;
    private int weight;
    private Double price;
    private String picturePath;

    public Product(String name, String description, String size, int weight, Double price, String picturePath) {
        this.name = name;
        this.description = description;
        this.size = size;
        this.weight = weight;
        this.price = price;
        this.picturePath = picturePath;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }
}
