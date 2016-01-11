/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author phuong
 */
public class Sanpham {
    private String name;
    private double gia;

    public Sanpham(String name, double gia) {
        this.name = name;
        this.gia = gia;
    }

    public Sanpham() {
    }

    public String getName() {
        return name;
    }

    public double getGia() {
        return gia;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    
}
