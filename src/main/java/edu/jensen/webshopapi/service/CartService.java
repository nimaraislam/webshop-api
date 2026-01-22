package edu.jensen.webshopapi.service;

import edu.jensen.webshopapi.entity.Cart;
import edu.jensen.webshopapi.entity.Product;
import edu.jensen.webshopapi.repository.CartRepository;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    private final CartRepository cartRepository;
    private final ProductService productService;

    public CartService(CartRepository cartRepository,ProductService productService) {
        this.cartRepository = cartRepository;
        this.productService = productService;
    }

    public Cart persistCart(int productId,int quantity){

        Product product = productService.getProductById(productId);
        Cart cart = new Cart();
        cart.setProduct(product);
        cart.setQuantity(quantity);
        return cartRepository.save(cart);
    }
    public Cart getCartById(int id){
        return cartRepository.findById(id).orElse(null);
    }
}
