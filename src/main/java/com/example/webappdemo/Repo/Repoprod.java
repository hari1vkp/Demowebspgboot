package com.example.webappdemo.Repo;

import com.example.webappdemo.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repoprod extends JpaRepository<Product,Integer> {
}
