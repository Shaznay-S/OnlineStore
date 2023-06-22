package org.yup.OnlineStore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.yup.OnlineStore.models.Order;
import org.yup.OnlineStore.models.Product;
import org.yup.OnlineStore.services.OrderService;
import org.yup.OnlineStore.services.ProductService;

import java.util.List;

public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("api/product")
    public List<Product> getAllProducts(){
        return this.productService.getAllProducts();
    }

    @PostMapping("api/product")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Product creatProduct(@RequestBody Product product){
        return this.productService.createProduct(product);
    }

    @GetMapping("api/product/{id}")
    public Product getProductById(@PathVariable Long Id){
        return this.productService.getProductById(Id);
    }


    @DeleteMapping("api/employee/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable Long Id){
        this.productService.deleteProduct(Id);
    }

    @PutMapping("api/order/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable Long Id){
        return this.productService.updateProduct(product, Id);
    }
}
