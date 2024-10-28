package com.baoandev.demojdbcv2.model.service;

import com.baoandev.demojdbcv2.model.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAllProducts();

    Product findProductById(int id);

    void createProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(int id);
}
