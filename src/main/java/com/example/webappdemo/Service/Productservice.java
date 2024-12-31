package com.example.webappdemo.Service;


import com.example.webappdemo.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Productservice
{
    List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, "laptop", 10000)
            , new Product(2, "mobile", 10000)
            , new Product(3, "tv", 10000)));

    public List<Product> getprod()
    {
        return products;
    }

    public Product getprodbyid(int id) {
        return products.stream()
                .filter(product -> product.getProdid() == id)
                .findFirst()
                .orElse(new Product(0, "no product found", 0));
    }

    public void addprod(Product prod) {
        products.add(prod);
    }

    public void updateprod(Product prod) {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdid() == prod.getProdid()) {
                index = i;
                break;
            }
        }
        products.set(index, prod);
    }

    public void deleteprod(int id)
    {
        int index = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdid() == id) {
                index = i;
                break;
            }
            products.remove(index);
        }
    }
}


