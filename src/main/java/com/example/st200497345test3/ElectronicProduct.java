package com.example.st200497345test3;

import java.util.Arrays;
import java.util.List;

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
        List<Integer> voltages = Arrays.asList(120,230,240);
        if(voltages.contains(voltage))
        {
            this.voltage = voltage;
        }
        else
        {
            throw new IllegalArgumentException("The voltage must be 120,230, or 240");
        }
    }

    public boolean isRemote() {
        return remote;
    }

    public void setRemote(boolean remote) {
        this.remote = remote;
    }
}
