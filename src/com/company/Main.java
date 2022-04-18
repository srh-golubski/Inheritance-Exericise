package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Laptop myLaptop = new Laptop ("Apple", "plug-in, battery", 1000.00, 64, 10.00, "black");
        myLaptop.accessorize("gold");
        myLaptop.upgrade();
        System.out.println("My Laptop \n Brand: " + myLaptop.getBrand() + "\nPower Source: " + myLaptop.getPowerSource() + "\nPrice: " + myLaptop.getPrice() + "\nMemory: " + myLaptop.getMemory() + "\nBattery Life: " + myLaptop.getBatteryLife() + "\nShell Color: " + myLaptop.getShellColor());

        SmartPhone mySmartPhone = new SmartPhone ("Apple", "plug-in, battery", 1249.99, 128, "Verizon", 12.50);
        mySmartPhone.superSize();
        mySmartPhone.discount(.25);
        System.out.println("\n\nMy Smart Phone \n Brand: " + mySmartPhone.getBrand() + "\nPower Source: " + mySmartPhone.getPowerSource() + "\nPrice: " + mySmartPhone.getPrice() + "\nMemory: " + mySmartPhone.getMemory() + "\nScreen Size" + mySmartPhone.getScreenSize());
    }
}
