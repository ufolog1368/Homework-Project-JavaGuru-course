package by.KomarovIgor.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void getNameTest() {
        Product product =new Product();
        product.setName("Apple");

        String expected = "Apple";
        String actual = product.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void getRegularPriceTest() {
        Product product =new Product();
        product.setRegularPrice(500);

        double expected = 500;
        double actual = product.getRegularPrice();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void getDiscountTest() {
        Product product =new Product();
        product.setDiscount(20);

        double expected = 20;
        double actual = product.getDiscount();
        assertEquals(expected, actual, 0);
    }

    @Test
    public void testEqualsTest() {
        Product product1 =new Product();
        product1.setName("Apple");
        product1.setRegularPrice(500);
        product1.setDiscount(20);

        Product product2 =new Product();
        product2.setName("Apple");
        product2.setRegularPrice(500);
        product2.setDiscount(20);

        boolean expected = true;
        boolean actual = product1.equals(product2);
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCodeTest() {
        Product product =new Product();
        System.out.println("product.hashCode() = " + product.hashCode());
        product.setName("Apple");
        product.setRegularPrice(500);
        product.setDiscount(20);

        int expected = 1133371673;
        int actual = product.hashCode();
        assertEquals(expected, actual);
    }

    @Test
    public void testToStringTest() {
        Product product =new Product();
        product.setName("Apple");
        product.setRegularPrice(500);
        product.setDiscount(20);

        System.out.println("product.toString() = " + product.toString());

        String expected = "Product{name='Apple', regularPrice=500.0, discount=20.0}";
        String actual = product.toString();
        assertEquals(expected, actual);
    }
}