package Entities;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by phuong on 1/16/2016.
 */
public class Unit implements java.io.Serializable {
    private int unitId;
    private String type;
    private int isPart;

    private Unit unit;
    private Set units = new HashSet(0);
    private Set unitDealers = new HashSet(0);

    public Unit() {
    }

    public Unit(String type, int isPart) {
        this.type = type;
        this.isPart = isPart;
    }

    public Unit(String type, int isPart, Unit unit, Set units, Set unitDealers) {
        this.type = type;
        this.isPart = isPart;
        this.unit = unit;
        this.units = units;
        this.unitDealers = unitDealers;
    }

    public int getUnitId() {
        return unitId;
    }

    public String getType() {
        return type;
    }

    public int getIsPart() {
        return isPart;
    }

    public Unit getUnit() {
        return unit;
    }

    public Set getUnits() {
        return units;
    }

    public Set getUnitDealers() {
        return unitDealers;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIsPart(int isPart) {
        this.isPart = isPart;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public void setUnits(Set units) {
        this.units = units;
    }

    public void setUnitDealers(Set unitDealers) {
        this.unitDealers = unitDealers;
    }
}
