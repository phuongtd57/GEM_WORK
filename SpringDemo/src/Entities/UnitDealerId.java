package Entities;

/**
 * Created by phuong on 1/16/2016.
 */
public class UnitDealerId implements java.io.Serializable {
    private int unitId;
    private int dealerId;

    public UnitDealerId() {
    }

    public UnitDealerId(int unitId, int dealerId) {
        this.unitId = unitId;
        this.dealerId = dealerId;
    }

    public int getUnitId() {
        return unitId;
    }

    public int getDealerId() {
        return dealerId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public void setDealerId(int dealerId) {
        this.dealerId = dealerId;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj == null) return false;
        if(!(obj instanceof UnitDealerId)) return false;

        UnitDealerId u = (UnitDealerId) obj;

        return (u.getDealerId() == this.dealerId && u.getUnitId() == this.dealerId);
    }
}
