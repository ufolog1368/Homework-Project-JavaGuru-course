package by.KomarovIgor.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void getNameTest() {
        Product product =new Product();
        product.setName("Apple");
    }

    @Test
    public void getRegularPriceTest() {
        Product product =new Product();
        product.setRegularPrice(500);
    }

    @Test
    public void getDiscountTest() {
        Product product =new Product();
        product.setDiscount(20);
    }

    @Test
    public void testEqualsTest() {
        Product product =new Product();
        product.setName("Apple");
        product.setRegularPrice(500);
        product.setDiscount(20);
    }

    @Test
    public void testHashCodeTest() {
        Product product =new Product();
        product.setName("Apple");
        product.setRegularPrice(500);
        product.setDiscount(20);
    }

    @Test
    public void testToStringTest() {
        Product product =new Product();
        product.setName("Apple");
        product.setRegularPrice(500);
        product.setDiscount(20);
    }
}