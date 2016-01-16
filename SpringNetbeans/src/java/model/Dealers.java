package model;
// Generated Jan 16, 2016 4:33:02 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Dealers generated by hbm2java
 */
public class Dealers  implements java.io.Serializable {


     private Integer dealerId;
     private String name;
     private String address;
     private Set unitDealers = new HashSet(0);
     private Set inventoryses = new HashSet(0);

    public Dealers() {
    }

	
    public Dealers(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public Dealers(String name, String address, Set unitDealers, Set inventoryses) {
       this.name = name;
       this.address = address;
       this.unitDealers = unitDealers;
       this.inventoryses = inventoryses;
    }
   
    public Integer getDealerId() {
        return this.dealerId;
    }
    
    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public Set getUnitDealers() {
        return this.unitDealers;
    }
    
    public void setUnitDealers(Set unitDealers) {
        this.unitDealers = unitDealers;
    }
    public Set getInventoryses() {
        return this.inventoryses;
    }
    
    public void setInventoryses(Set inventoryses) {
        this.inventoryses = inventoryses;
    }




}


