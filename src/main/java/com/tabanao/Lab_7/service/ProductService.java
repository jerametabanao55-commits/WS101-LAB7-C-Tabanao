package com.tabanao.Lab_7.service;


import com.tabanao.Lab_7.model.Products;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    public Optional<Products> update(Long id, Products p) {
        Optional<Products> o = Optional.empty();
        return o;
    }

    public Boolean delete(Long id) {
        return null;
    }

    public List<Products> getAll() {
        return List.of();
    }

    public Optional<Object> getAll(Long id) {
        return Optional.empty();
    }

    public ScopedValue<Object> getById(Long id) {
        return null;
    }
}