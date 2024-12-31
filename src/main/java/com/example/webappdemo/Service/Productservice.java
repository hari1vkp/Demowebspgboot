package com.example.webappdemo.Service;


import com.example.webappdemo.Model.Product;
import com.example.webappdemo.Repo.Repoprod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Productservice
{
//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, "laptop", 10000)
//            , new Product(2, "mobile", 10000)
//            , new Product(3, "tv", 10000)));
    @Autowired
    Repoprod products;

    public List<Product> getprod()
    {
        return products.findAll();
    }

    public Product getprodbyid(int id) {
        return products.findById(id).orElse(new Product());
    }

    public void addprod(Product prod) {

        products.save(prod);
    }

    public void updateprod(Product prod) {

        products.save( prod);
    }

    public void deleteprod(int id)
    {

            products.deleteById(id);
        }
    }

