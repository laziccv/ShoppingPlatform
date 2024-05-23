package com.team36.webProg.Repository;

import com.team36.webProg.model.Product;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
	public List<Product> findAll();
	
	public List<Product> findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(String name, String description);

	public List<Product> findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCaseAndCategoryContainingIgnoreCaseAndPriceBetween(
	            String name, String description, String category, Double minPrice, Double maxPrice);

	public List<Product> findByCategoryContainingIgnoreCase(String category);
	
	
}
