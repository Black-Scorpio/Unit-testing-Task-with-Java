package com.example.st200497345test3;

public class Product {

    private int sku;
    private String name;
    private Manufacturer manufacturer;
    private double msrp;
    private int unitsInStock;
    private int unitsSold = 0;

    public Product(int sku, String name, Manufacturer manufacturer, double msrp, int unitsInStock) {
        setSku(sku);
        setName(name);
        setManufacturer(manufacturer);
        setMsrp(msrp);
        setUnitsInStock(unitsInStock);
    }

    /**
     * Recieves an int argument if the stock is > 0 unitsInStock and unitsSold will be updated.
     * The method returns the number of units sold
     * @param items
     * @return
     */
    public int sellItem(int items){
        if(items > unitsInStock)
            items = unitsInStock;

        if(unitsInStock > 0)
            unitsInStock = getUnitsInStock() - items;
            unitsSold += items;

        return items;
    }

    /**
     * Returns a double representing unitsInStock * msrp
     * @return
     */
    public double getStockValue(){
        return getUnitsInStock() * getMsrp();
    }

    /**
     * Returns a double representing unitsSold * msrp
     * @return
     */
    public double getRevenue(){
        return unitsSold * msrp;
    }

    /**
     * Returns a Product String in the form "sku-name"
     * @return
     */
    public String toString(){
        return String.format("%s-%s",getSku(),getName());
    }


    public int getSku() {
        return sku;
    }

    /**
     * Sets the sku if it is in the range of 1000-9999 inclusive
     * @param sku
     */
    public void setSku(int sku) {
        if(sku >= 1000 && sku <= 9999)
            this.sku = sku;

        else
            throw new IllegalArgumentException("The sku must be between 1000 - 9999 inclusive");
    }

    public String getName() {
        return name;
    }

    /**
     * Sets the name if it is greater than or equal to 2 in chraacter length
     * @param name
     */
    public void setName(String name) {
        name = name.trim();
        if(name.length() >= 2)
            this.name = name;
        else
            throw new IllegalArgumentException("The length of the name must be 2 or more characters");
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

    /**
     * sets the Msrp if it is in the range 0-100 inclusive
     * @param msrp
     */
    public void setMsrp(double msrp) {
        if(msrp >= 0 && msrp <= 100)
            this.msrp = msrp;

        else
            throw new IllegalArgumentException("The msrp must be between 0 - 100 inclusive");
    }

    public int getUnitsInStock() {
        return unitsInStock;
    }

    /**
     * Sets the amount of unitsInStock if the value is greater than 0
     * @param unitsInStock
     */
    public void setUnitsInStock(int unitsInStock) {
        if(unitsInStock > 0)
            this.unitsInStock = unitsInStock;

        else
            throw new IllegalArgumentException("The unitsInStock must be greater than 0");
    }

    public int getUnitsSold() {
        return unitsSold;
    }
}
