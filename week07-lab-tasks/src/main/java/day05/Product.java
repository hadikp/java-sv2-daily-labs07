package day05;

import java.time.LocalDate;

public class Product {

    private String name;
    private LocalDate saleDate;
    private int price;

    public Product(String name, LocalDate saleDate, int price) {
        this.name = name;
        this.saleDate = saleDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public int getPrice() {
        return price;
    }
}
