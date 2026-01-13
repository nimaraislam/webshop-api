package edu.jensen.webshopapi.service;

import edu.jensen.webshopapi.entity.Product;
import edu.jensen.webshopapi.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }
}
