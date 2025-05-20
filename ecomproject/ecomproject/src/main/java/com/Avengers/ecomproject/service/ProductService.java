package com.Avengers.ecomproject.service;

import com.Avengers.ecomproject.mode.Product;
import com.Avengers.ecomproject.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;
    public List<Product> getProducts() {
        return productRepo.findAll();
    }
    public Product getProduct(int id) {
        return productRepo.findById(id).orElse(null);
    }

    public Product addProduct(Product product) {
        return productRepo.save(product);
    }

    public Product updateProduct(Product product) {
        return productRepo.save(product);
    }
    public void deleteProduct(int  productid) {
        productRepo.deleteById(productid);
    }

}
