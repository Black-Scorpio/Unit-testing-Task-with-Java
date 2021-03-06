package com.example.st200497345test3;

public class Manufacturer {
    private String name;
    private String address;
    private String phoneNumber;

    public Manufacturer(String name, String address, String phoneNumber) {
        setName(name);
        setAddress(address);
        setPhoneNumber(phoneNumber);
    }

    public String getName() {
        return name;
    }

    /**
     * Validation for name must be 2 or more characters
     * @param name -String
     */
    public void setName(String name) {
        name = name.trim();
        name = name.substring(0,1).toUpperCase() + name.substring(1);
        if(name.length() >= 2)
            this.name = name;
        else
            throw new IllegalArgumentException("The length of the name must be 2 or more characters");
    }

    public String getAddress() {
        return address;
    }

    /**
     * Validation for Address must be 5 or more characters
     * @param address - String
     */
    public void setAddress(String address) {
        address = address.trim();
        address = address.substring(0,1).toUpperCase() + address.substring(1);
        if(address.length() >= 5)
            this.address = address;
        else
            throw new IllegalArgumentException("The length of the address must be 5 or more characters");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the length of the phoneNumber validation must be between 10 and 14 characters long
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber.trim();
        if(phoneNumber.length() >= 10 && phoneNumber.length() <= 14)
            this.phoneNumber = phoneNumber;
        else
            throw new IllegalArgumentException("The length of the phone number must be between 10 and 14 characters long");
    }

    /**
     * Returns the name and address of the Manufacturer object
     * @return
     */
    public String toString(){
        return String.format("%s, %s",getName(),getAddress());
    }
}
