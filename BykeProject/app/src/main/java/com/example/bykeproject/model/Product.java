package com.example.bykeproject.model;

import com.google.gson.annotations.SerializedName;

public class Product {
    @SerializedName("id")
    private  int id;
    @SerializedName("name")
    private String name;
    @SerializedName("price")
    private  double price;
    @SerializedName("qty")
    private int qty;
    @SerializedName("ownerName")
    private String owner;
    @SerializedName("email")
    private String email;
    @SerializedName("color")
    private String color;
    @SerializedName("brandName")
    private String brand;
    @SerializedName("type")
    private String type;
    @SerializedName("chesisNumber")
    private int Chesis;
    @SerializedName("sellerName")
    private String seller;
    @SerializedName("address")
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getChesis() {
        return Chesis;
    }

    public void setChesis(int chesis) {
        Chesis = chesis;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
