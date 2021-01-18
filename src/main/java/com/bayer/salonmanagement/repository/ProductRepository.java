package com.bayer.salonmanagement.repository;

import com.bayer.salonmanagement.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
