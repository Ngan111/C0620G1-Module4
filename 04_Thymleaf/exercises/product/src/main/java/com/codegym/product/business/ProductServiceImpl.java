package com.codegym.product.business;

import com.codegym.product.dao.ProductDAO;
import com.codegym.product.dao.ProductDAOImpl;
import com.codegym.product.model.Product;

import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService<Product> {
    private static ProductDAO<Product> productDAO= new ProductDAOImpl();
    @Override
    public Optional<Product> get(int id) {
        return productDAO.get(id);
    }

    @Override
    public List<Product> getAll() {
        return productDAO.getAll();
    }

    @Override
    public int save(Product product) {
        return productDAO.save(product);
    }

    @Override
    public int update(Product product) {
        return productDAO.update(product);
    }

    @Override
    public int removeById(int id) {
        return productDAO.removeById(id);
    }

    @Override
    public List<Product> search(String name) {
        return productDAO.search(name);
    }
}