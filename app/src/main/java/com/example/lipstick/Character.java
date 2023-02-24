package com.example.lipstick;

public class Character {
    private int id;
    private String name;
    private String detail;
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public Character(){}
    public Character(int id,String name,String detail,String price)
    {
        this.id=id;
        this.name=name;
        this.detail=detail;
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
