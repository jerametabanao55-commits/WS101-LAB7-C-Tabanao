package com.tabanao.Lab_7.controller;

import com.tabanao.Lab_7.model.Products;
import com.tabanao.Lab_7.model.ProductInput;
import com.tabanao.Lab_7.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    // GET all products
    @GetMapping
    public List<Products> products() {
        return service.getAll();
    }

    // GET product by ID
    @GetMapping("/{id}")
    public Object productById(@PathVariable Long id) {
        return service.getById(id).orElse(null);
    }

    // UPDATE product
    @PutMapping("/{id}")
    public Products updateProduct(@PathVariable Long id,
                                  @RequestBody ProductInput input) {
        Products p = new Products();
        p.setName(Long.valueOf(input.getName()));
        p.setPrice(input.getPrice());

        return service.update(id, p).orElse(null);
    }

    // DELETE product
    @DeleteMapping("/{id}")
    public Boolean deleteProduct(@PathVariable Long id) {
        return service.delete(id);
    }
}
