package com.Avengers.ecomproject.repo;

import com.Avengers.ecomproject.mode.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
