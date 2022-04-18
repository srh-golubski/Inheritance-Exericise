package com.company;

public class SmartPhone extends Computer {
    //fields
    private String serviceProvider;
    private Double screenSize;

    //constructor
    public SmartPhone(String brand, String powerSource, Double price, Integer memory, String serviceProvider, Double screenSize) {
        super(brand, powerSource, price, memory);
        this.serviceProvider = serviceProvider;
        this.screenSize = screenSize;
    }

    //getters & setters


    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    //instance method
    public void superSize() {
        screenSize = screenSize * 1.25;
        price = price + 100;
    }
}
