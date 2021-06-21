package com.kanishka.pricecalculatorbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ItemBatch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String itemCode;

    private int noOfCartons;

    private int  noOfSingleUnits;

    private int totalUnits;

    private double price;

    public ItemBatch(){

    }

    public ItemBatch(long id, String itemCode, int noOfCartons, int noOfSingleUnits) {
        super();
        this.id = id;
        this.itemCode = itemCode;
        this.noOfCartons = noOfCartons;
        this.noOfSingleUnits = noOfSingleUnits;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getNoOfCartons() {
        return noOfCartons;
    }

    public void setNoOfCartons(int noOfCartons) {
        this.noOfCartons = noOfCartons;
    }

    public int getNoOfSingleUnits() {
        return noOfSingleUnits;
    }

    public void setNoOfSingleUnits(int noOfSingleUnits) {
        this.noOfSingleUnits = noOfSingleUnits;
    }


    public int getTotalUnits() {
        return totalUnits;
    }

    public void setTotalUnits(int totalUnits) {
        this.totalUnits = totalUnits;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
