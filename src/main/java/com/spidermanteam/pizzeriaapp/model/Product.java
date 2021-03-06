package com.spidermanteam.pizzeriaapp.model;

import javax.persistence.*;

@Entity
@Table(name = "menu")
public class Product {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Double price;

    @Column(name = "picturePath")
    private String picturePath;

    public Product(String name, String description, Double price, String picturePath) {

        this.name = name;
        this.description = description;
        this.price = price;
        this.picturePath = picturePath;
    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object obj) {
        Product other = (Product)obj;
        if(obj == null){
            return false;
        }
        return this.id == (other.getId());
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()*37;
    }
}
