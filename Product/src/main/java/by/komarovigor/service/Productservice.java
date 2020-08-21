package by.komarovigor.service;

import by.komarovigor.bean.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Productservice {
    private Logger logger = LoggerFactory.getLogger(Productservice.class);

    public  double actualPrice(Product product){
        double discount = (product.getRegularPrice()/100) * product.getDiscount();
        return product.getRegularPrice() - discount;


    }

    public String printInformation(Product product){
        logger.info("Check price");
        return "Name= " + product.getName() + ", Price= " + product.getRegularPrice() + ", discount= " + product.getDiscount();


    }

}


