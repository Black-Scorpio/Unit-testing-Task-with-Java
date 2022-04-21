package com.example.st200497345test3;

import java.util.ArrayList;

public class Store {
    private int storeID;
    private String streetAddress;
    private String phoneNumber;
    private ArrayList<Product> inventory;

    public Store(int storeID, String streetAddress, String phoneNumber) {
        this.storeID = storeID;
        this.streetAddress = streetAddress;
        this.phoneNumber = phoneNumber;
        inventory = new ArrayList<>();

    }

    /**
     * Adds product object to the inventory ArrayList
     * @param product
     */
    public void addProduct(Product product){
        inventory.add(product);
    }

    public double getInventoryMSRP(){
        return 0.0;
    }

    public int getNumOfProductsInventory(){
        return -1;
    }

    public String toString(){
        return "";
    }

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<Product> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Product> inventory) {
        this.inventory = inventory;
    }


}
