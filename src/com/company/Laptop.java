package com.company;

public class Laptop extends Computer {
    //additional fields
    private Double batteryLife;
    private String shellColor;

    //constructor

    public Laptop(String brand, String powerSource, Double price, Integer memory, Double batteryLife, String shellColor) {
        super(brand, powerSource, price, memory);
        this.batteryLife = batteryLife;
        this.shellColor = shellColor;
    }


    //getters & setters

    public Double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(Double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getShellColor() {
        return shellColor;
    }

    public void setShellColor(String shellColor) {
        this.shellColor = shellColor;
    }

    //instance method
    public void accessorize(String newColor) {
        this.shellColor = newColor;
    }
}
