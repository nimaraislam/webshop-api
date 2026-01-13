package edu.jensen.webshopapi.repository;

import edu.jensen.webshopapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//order--JpaRepository<ENTITY, ID_TYPE>
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
