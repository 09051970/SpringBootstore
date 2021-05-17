package org.factoriaf5.store.model;

public class Product {

    private final String name;
    private final int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;

    }
    public String getName() {
         return name;
    }
    public String getPrice() {
        return price;
    }
}
