package com.kanishka.pricecalculatorbackend.model;


import javax.persistence.*;

@Entity
public class Item {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itemId;
    @Id
    private String itemCode;
    private String itemName;
    private double cartonPrice;
    private double discount;
    private double singleUnitPriceIncrease;
    private int minCartonsForDiscount;
    private int numOfUnitsPerCarton;


    public Item( ) {

    }

    public Item(long itemId, String itemCode, String itemName, double cartonPrice, double discount, double singleUnitPriceIncrease, int minCartonsForDiscount, int numOfUnitsPerCarton) {
        this.itemId = itemId;
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.cartonPrice = cartonPrice;
        this.discount = discount;
        this.singleUnitPriceIncrease = singleUnitPriceIncrease;
        this.minCartonsForDiscount = minCartonsForDiscount;
        this.numOfUnitsPerCarton = numOfUnitsPerCarton;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getCartonPrice() {
        return cartonPrice;
    }

    public void setCartonPrice(double cartonPrice) {
        this.cartonPrice = cartonPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getSingleUnitPriceIncrease() {
        return singleUnitPriceIncrease;
    }

    public void setSingleUnitPriceIncrease(double singleUnitPriceIncrease) {
        this.singleUnitPriceIncrease = singleUnitPriceIncrease;
    }

    public int getMinCartonsForDiscount() {
        return minCartonsForDiscount;
    }

    public void setMinCartonsForDiscount(int minCartonsForDiscount) {
        this.minCartonsForDiscount = minCartonsForDiscount;
    }

    public int getNumOfUnitsPerCarton() {
        return numOfUnitsPerCarton;
    }

    public void setNumOfUnitsPerCarton(int numOfUnitsPerCarton) {
        this.numOfUnitsPerCarton = numOfUnitsPerCarton;
    }
}




