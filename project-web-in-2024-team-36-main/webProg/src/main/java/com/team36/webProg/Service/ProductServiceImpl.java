package com.team36.webProg.Service;

import com.team36.webProg.Repository.ProductRepository;
import com.team36.webProg.Repository.UsersRepository;
import com.team36.webProg.iService.ProductService;
import com.team36.webProg.model.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    public final ProductRepository _productRepo;

    @Autowired
    public ProductServiceImpl(ProductRepository _productRepo) { this._productRepo = _productRepo; }

	@Override
	public List<Product> findAll() {
		
		return _productRepo.findAll();
	}

	@Override
	public List<Product> searchProducts(String query) {
		
		return _productRepo.findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCase(query, query);
	}

	@Override
	public List<Product> filterProducts(String query, String category, Double minPrice, Double maxPrice) {
		
		return _productRepo.findByNameContainingIgnoreCaseOrDescriptionContainingIgnoreCaseAndCategoryContainingIgnoreCaseAndPriceBetween(
                query, query, category != null ? category : "", minPrice != null ? minPrice : 0.0, maxPrice != null ? maxPrice : Double.MAX_VALUE);
	}
}
