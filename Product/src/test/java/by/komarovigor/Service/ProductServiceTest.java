package by.komarovigor.Service;

import by.komarovigor.bean.Product;
import org.junit.Test;

import static org.junit.Assert.*;


public class ProductServiceTest {

    @Test
    public void actualPrice() {
     Product product = new Product("Phone", 500.0, 20);
     Productservice productService = new Productservice();
     double expected = 400;
     double actual = productService.actualPrice(product);
     assertEquals(expected, actual, 0.0);
    }

    @Test
    public void printInformation() {
        Product product = new Product("Hard disk", 100.0, 10);
        Productservice productService = new Productservice();
        String expected = "Name= " + product.getName() + ", Price= " + product.getRegularPrice() + ", discount= " + product.getDiscount();
        String actual = productService.printInformation(product);
        assertEquals(expected, actual);


    }
}
//"Name= " + product.getName() + ", Price= " + product.getRegularPrice() + ", discount= " + product.getDiscount();
//"Name= Hard disk, Price= 100.0, discount= 10.0";