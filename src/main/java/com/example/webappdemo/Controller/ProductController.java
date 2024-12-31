package com.example.webappdemo.Controller;

import com.example.webappdemo.Model.Product;
import com.example.webappdemo.Service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.security.PublicKey;
import java.util.List;
@RestController
public class ProductController
{
    @Autowired
    Productservice Service;
    @RequestMapping("/product")
    public List<Product> getprod()
    {
        return Service.getprod();
    }
    @RequestMapping("/product/{id}")
    public Product getprodbyid(@PathVariable  int id)
    {
        return Service.getprodbyid(id);
    }
    @PostMapping("/product")
    public String addprod(@RequestBody Product prod)
    {
        Service.addprod(prod);
        return "added";
    }
    @PutMapping("/product")
    public String updateprod(@RequestBody Product prod)
    {
        Service.updateprod(prod);
        return "updated";
    }
    @DeleteMapping("/product/{id}")
    public String deleteprod(@PathVariable int id)
    {
        Service.deleteprod(id);
        return "deleted";
    }
}