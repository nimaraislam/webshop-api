package edu.jensen.webshopapi.controller;

import edu.jensen.webshopapi.entity.Product;
import edu.jensen.webshopapi.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
<<<<<<< HEAD
@CrossOrigin(origins = {
        "http://localhost:3000",
        "http://192.168.0.212:3000"
})

=======
@CrossOrigin(origins = "http://localhost:3000")
>>>>>>> 9364781 (updated cart api)
@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){

        return productService.persistProduct(product);
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
