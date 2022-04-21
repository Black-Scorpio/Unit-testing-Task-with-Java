package com.example.st200497345test3;

public class ElectronicProduct extends Product {
    private int voltage;
    private boolean remote;


    public ElectronicProduct(int sku, String name, Manufacturer manufacturer, double msrp, int unitsInStock, int voltage, boolean remote) {
        super(sku, name, manufacturer, msrp, unitsInStock);
        setVoltage(voltage);
        setRemote(remote);
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public boolean isRemote() {
        return remote;
    }

    public void setRemote(boolean remote) {
        this.remote = remote;
    }
}
