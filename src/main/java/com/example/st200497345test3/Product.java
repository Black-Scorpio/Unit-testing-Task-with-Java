package com.example.st200497345test3;

public class Product {

    private int sku;
    private String name;
    private Manufacturer manufacturer;
    private double msrp;
    private int unitsInStock;
    private int unitsSold;

    public Product(int sku, String name, Manufacturer manufacturer, double msrp, int unitsInStock) {
        this.sku = sku;
        this.name = name;
        this.manufacturer = manufacturer;
        this.msrp = msrp;
        this.unitsInStock = unitsInStock;
    }

    public int sellItem(){
        return 1;
    }

    public double getStockValue(){
        return 0.0;
    }

    public double getRevenue(){
        return 0.0;
    }

    public String toString(){
        return "";
    }


    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getMsrp() {
        return msrp;
    }

    public void setMsrp(double msrp) {
        this.msrp = msrp;
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }
}
