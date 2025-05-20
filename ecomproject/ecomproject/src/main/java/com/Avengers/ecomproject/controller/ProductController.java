package com.Avengers.ecomproject.controller;

import com.Avengers.ecomproject.mode.Product;
import com.Avengers.ecomproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }
    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable int id) {
        return productService.getProduct(id);
    }
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }
    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
    }


}