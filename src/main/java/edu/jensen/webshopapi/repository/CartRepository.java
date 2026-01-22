package edu.jensen.webshopapi.repository;

import edu.jensen.webshopapi.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository <Cart,Integer>{

}
