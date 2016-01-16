package Entities;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by phuong on 1/16/2016.
 */
public class Dealer implements java.io.Serializable {

    private int dealerId;
    private String name;
    private String address;

    private Set inventorys = new HashSet(0);
    private Set unitDealers = new HashSet(0);

    public Dealer() {
    }

    public Dealer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Dealer(String name, String address, Set inventorys, Set unitDealers) {
        this.name = name;
        this.address = address;
        this.inventorys = inventorys;
        this.unitDealers = unitDealers;
    }

    public int getDealerId() {
        return dealerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }


    public Set getUnitDealers() {
        return unitDealers;
    }

    public void setDealerId(int dealerId) {
        this.dealerId = dealerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set getInventorys() {
        return inventorys;
    }

    public void setInventorys(Set inventorys) {
        this.inventorys = inventorys;
    }

    public void setUnitDealers(Set unitDealers) {
        this.unitDealers = unitDealers;
    }
}
