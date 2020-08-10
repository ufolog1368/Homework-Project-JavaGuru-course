package by.KomarovIgor.Service;

import by.KomarovIgor.bean.Product;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ProductServiceTest {

    @Test
    public void actualPrice() {
     Product product = new Product("Phone", 500.0, 20);
     ProductService productService = new ProductService();
     double expected = 400;
     double actual = productService.actualPrice(product);
     assertEquals(expected, actual, 0.0);
    }

    @Test
    public void printInformation() {
        Product product = new Product("Hard disk", 100.0, 10);
        ProductService productService = new ProductService();
        String expected = "Name= Hard disk, Price= 100.0, discount= 10.0";
        String actual = productService.printInformation(product);
        assertEquals(expected, actual);


    }
}