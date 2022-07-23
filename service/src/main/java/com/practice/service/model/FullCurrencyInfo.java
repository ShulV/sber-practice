package com.practice.service.model;

import java.sql.Date;

public class FullCurrencyInfo {
    private String ID;

    private double value;
    private Date date;
    private int nominal;
    private int numCode;
    private String charcode;
    private String name;

    public int getNumCode() {
        return numCode;
    }

    public void setNumCode(int numCode) {
        this.numCode = numCode;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public String getCharcode() {
        return charcode;
    }

    public void setCharcode(String charcode) {
        this.charcode = charcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FullCurrencyInfo() {

    }

    public FullCurrencyInfo(String ID, double value, Date date, int nominal, int numCode, String charcode, String name) {
        this.ID = ID;
        this.value = value;
        this.date = date;
        this.nominal = nominal;
        this.numCode = numCode;
        this.charcode = charcode;
        this.name = name;
    }

    @Override
    public String toString() {
        return "FullCurrencyInfo{" +
                "ID='" + ID + '\'' +
                ", value=" + value +
                ", date=" + date +
                ", nominal=" + nominal +
                ", numCode=" + numCode +
                ", charcode='" + charcode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}