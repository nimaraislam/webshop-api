package edu.jensen.webshopapi.service;

import edu.jensen.webshopapi.entity.Product;
import edu.jensen.webshopapi.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product persistProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public Product getProductById (int id){
        return productRepository.findById(id).orElse(null);
    }
}
