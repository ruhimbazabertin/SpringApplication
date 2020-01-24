package com.shop.demo.service;

import com.shop.demo.dao.ProductRepository;
import com.shop.demo.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
   @Autowired
    private ProductRepository productRepo;

   //List all methods will be needed by product controller

    public List<Product> listAll(){
        return productRepo.findAll();
    }
    public void create(Product product){
         productRepo.save(product);
    }
    public Optional<Product> findProduct(int id){
        return productRepo.findById(id);
    }
    public void deleteProduct(int id){
        productRepo.deleteById(id);
    }
}
