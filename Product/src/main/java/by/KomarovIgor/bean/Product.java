package by.KomarovIgor.bean;

import java.util.Objects;

public class Product {
    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    private String name;
    private double regularPrice;
    private double discount;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.regularPrice, regularPrice) == 0 &&
                Double.compare(product.discount, discount) == 0 &&
                name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, regularPrice, discount);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", regularPrice=" + regularPrice +
                ", discount=" + discount +
                '}';
    }
}
