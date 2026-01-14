package edu.jensen.webshopapi.controller;

import edu.jensen.webshopapi.entity.Product;
import edu.jensen.webshopapi.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){

        return productService.saveProduct(product);
    }

    @GetMapping
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("/{id}")
    public Product getProductById (@PathVariable int id){
        return productService.getProductById(id);
    }
}
