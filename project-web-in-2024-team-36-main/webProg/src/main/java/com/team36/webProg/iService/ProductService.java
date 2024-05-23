package com.team36.webProg.iService;
import java.util.List;

import com.team36.webProg.model.Product;

public interface ProductService {
	
	List<Product> findAll();
	
    List<Product> searchProducts(String query); 

    List<Product> filterProducts(String query, String category, Double minPrice, Double maxPrice);
}
