package com.baoandev.demojdbcv2.model.service.impl;

import com.baoandev.demojdbcv2.model.entity.Product;
import com.baoandev.demojdbcv2.model.repository.IProductRepository;
import com.baoandev.demojdbcv2.model.repository.impl.ProductRepository;
import com.baoandev.demojdbcv2.model.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private final IProductRepository repository = new ProductRepository();

    @Override
    public List<Product> findAllProducts() {
        return repository.getAllProducts();
    }

    @Override
    public Product findProductById(int id) {
        return null;
    }

    @Override
    public void createProduct(Product product) {

    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(int id) {

    }
}
