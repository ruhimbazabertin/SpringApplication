package com.shop.demo.controller;

import com.shop.demo.domain.Product;
import com.shop.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/")
    public String homepage(){
        return "Welcome to One Stop Shop Center API";
    }
    @GetMapping("/products")
    public List<Product> products (){
        return service.listAll();
    }
    @GetMapping("/products/{id}")
    public Optional<Product> findProduct (@PathVariable int id){
        return service.findProduct(id);
    }
    @PostMapping("/products")
    public void createProduct(@RequestBody Product product){
        service.create(product);
    }
    @PutMapping("/product/{id}")
    public void upadateProduct(@RequestBody Product product, @PathVariable int id){
         service.create(product);
    }
    @DeleteMapping("/pro/{id}")
    public void delete(@PathVariable int id){
        service.deleteProduct(id);

    }

}
