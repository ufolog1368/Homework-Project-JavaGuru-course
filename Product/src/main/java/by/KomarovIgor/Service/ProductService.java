package by.KomarovIgor.Service;

import by.KomarovIgor.bean.Product;

public class ProductService {
    public  double actualPrice(Product product){
        double discount = (product.getRegularPrice()/100) * product.getDiscount();
        return product.getRegularPrice() - discount;


    }

    public String printInformation(Product product){
        return "Name= " + product.getName() + ", Price= " + product.getRegularPrice() + ", discount= " + product.getDiscount();


    }

}


