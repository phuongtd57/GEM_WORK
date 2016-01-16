package Entities;

/**
 * Created by phuong on 1/16/2016.
 */
public class UnitDealer {
    private UnitDealerId id;
    private Dealer dealer;
    private Unit unit;
    private double price;

    public UnitDealer() {
    }

    public UnitDealer(UnitDealerId id, Dealer dealer, Unit unit, double price) {
        this.id = id;
        this.dealer = dealer;
        this.unit = unit;
        this.price = price;
    }

    public UnitDealerId getId() {
        return id;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public Unit getUnit() {
        return unit;
    }

    public double getPrice() {
        return price;
    }

    public void setId(UnitDealerId id) {
        this.id = id;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
