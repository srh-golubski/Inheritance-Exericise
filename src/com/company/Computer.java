package com.company;

public class Computer {

    //fields
    private String brand;
    private String powerSource;
    public Double price;
    private Integer memory;

    //getters & setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public static void main(String[] args) {

    }

    //constructor


    public Computer(String brand, String powerSource, Double price, Integer memory) {
        this.brand = brand;
        this.powerSource = powerSource;
        this.price = price;
        this.memory = memory;
    }

    //instance methods
    public void discount (Double percentOff) {
        price = price * (1 - percentOff);
    }

    public void upgrade () {
        price = price + 100;
        memory = memory + 64;
    }
}
