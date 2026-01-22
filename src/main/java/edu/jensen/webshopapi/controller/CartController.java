package edu.jensen.webshopapi.controller;

import edu.jensen.webshopapi.dto.CartDto;
import edu.jensen.webshopapi.entity.Cart;
import edu.jensen.webshopapi.service.CartService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carts")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping
    public Cart addCart(@RequestBody CartDto cartDto){
        return cartService.persistCart(cartDto.getProductId(),cartDto.getQuantity());
    }
    @GetMapping("/{id}")
    public Cart getCartById(@PathVariable int id){
        return cartService.getCartById(id);
    }
}
