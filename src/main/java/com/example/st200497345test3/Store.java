package com.example.st200497345test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
    private int storeID;
    private String streetAddress;
    private String city;
    private String phoneNumber;
    private ArrayList<Product> inventory;

    public Store(int storeID, String streetAddress, String city, String phoneNumber) {
        setStoreID(storeID);
        setStreetAddress(streetAddress);
        setCity(city);
        setPhoneNumber(phoneNumber);
        inventory = new ArrayList<>();

    }

    /**
     * Adds product object to the inventory ArrayList
     * if the object is not already in the list
     * @param product
     */
    public void addProduct(Product product){
        if(!inventory.contains(product))
            inventory.add(product);
        else throw new IllegalArgumentException("The product is already in the inventory");
    }

    /**
     * Calculates the totalSum of msrp*unitsInStock for every Product in the inventory
     * @return
     */
    public double getInventoryMSRP(){
        double totalSum = 0;
        for (Product product: inventory) {
            totalSum += product.getMsrp() * product.getUnitsInStock();
        }
        return totalSum;
    }

    public int getNumOfProductsInventory(){
        return inventory.size();
    }

    /**
     * Store toString method in the form of "%s has %s unique products worth $%.2f"
     * @return
     */
    public String toString(){
        return String.format("%s has %s unique products worth $%.2f",getStreetAddress(),getNumOfProductsInventory(), getInventoryMSRP());
    }

    public int getStoreID() {
        return storeID;
    }

    /**
     * Sets the storeID to be between 1-200 inclusive
     * @param storeID
     */
    public void setStoreID(int storeID) {
        if(storeID >= 1 && storeID <= 200)
            this.storeID = storeID;

        else
            throw new IllegalArgumentException("The storeID must be between 1 - 200 inclusive");
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the streetAddress if it is 2 or more characters in length
     * @param streetAddress
     */
    public void setStreetAddress(String streetAddress) {
        streetAddress = streetAddress.trim();
        if(streetAddress.length() >= 5)
            this.streetAddress = streetAddress;
        else
            throw new IllegalArgumentException("The length of the streetAddress must be 2 or more characters");
    }

    public String getCity() {
        return city;
    }

    /**
     * Sets the city if it is one of "Halifax","Fredricton","Charlottetown","Saint John's","Quebec",
     *                 "Toronto","Winnipeg","Regina","Edmonton","Victoria","Whitehorse","Yellowknife","Iqaluit"
     * @param city
     */
    public void setCity(String city) {
        city = city.trim();
        city = city.substring(0,1).toUpperCase() + city.substring(1);
        List<String> citys = Arrays.asList("Halifax","Fredricton","Charlottetown","Saint John's","Quebec",
                "Toronto","Winnipeg","Regina","Edmonton","Victoria","Whitehorse","Yellowknife","Iqaluit" );
        if(citys.contains(city))
        {
            this.city = city;
        }
        else
        {
            throw new IllegalArgumentException(String.format("The city must be one of %s",citys));
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * sets the phoneNumber if the length of the phoneNumber is in 10-14 inclusive
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber.trim();
        if(phoneNumber.length() >= 10 && phoneNumber.length() <= 14)
            this.phoneNumber = phoneNumber;
        else
            throw new IllegalArgumentException("The length of the phone number must be between 10 and 14 characters long");
    }


}
