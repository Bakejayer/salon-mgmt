package com.bayer.salonmanagement.repository;

import com.bayer.salonmanagement.model.SellableProduct;
import org.springframework.data.repository.CrudRepository;

public interface SellableProductRepository extends CrudRepository<SellableProduct, Long> {
}
