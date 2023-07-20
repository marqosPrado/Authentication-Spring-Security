package com.marcosprado.authenticationapplication.controllers;

import com.marcosprado.authenticationapplication.entities.Product;
import com.marcosprado.authenticationapplication.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public ResponseEntity listAllProduct() {
        return ResponseEntity.ok().body(productService.listAll());
    }

    @PostMapping("/add-product")
    public ResponseEntity addingProduct(Product product) {
        productService.save(product);
        return ResponseEntity.ok().build();
    }
}
