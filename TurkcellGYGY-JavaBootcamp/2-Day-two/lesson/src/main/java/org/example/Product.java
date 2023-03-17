package org.example;

public class Product {
    private int id;
    private String name;
    private double unitPrice;
    private double discount;

    public Product()
    {

    }

    public Product(int id, String name, double unitPrice, double discount) {
        this(); //parametresiz constructor'ı çağır.
        new Product(); //alternatif
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getUnitPriceAfterDiscount() {
        return unitPrice - (unitPrice * discount / 100);
    }
}
