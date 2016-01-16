package Entities;

import java.io.Serializable;

/**
 * Created by phuong on 1/16/2016.
 */
public class Inventory implements Serializable {
    private int inventoryId;
    private String name;
    private String address;
    private Dealer dealer;

    public Inventory() {
    }

    public Inventory(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Inventory(String name, String address, Dealer dealer) {
        this.name = name;
        this.address = address;
        this.dealer = dealer;
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }
}
