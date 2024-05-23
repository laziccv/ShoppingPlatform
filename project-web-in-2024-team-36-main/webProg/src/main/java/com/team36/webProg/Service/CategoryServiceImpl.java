package com.team36.webProg.Service;

import com.team36.webProg.Repository.CategoryRepository;
import com.team36.webProg.Repository.ProductRepository;
import com.team36.webProg.Repository.UsersRepository;
import com.team36.webProg.iService.CategoryService;
import com.team36.webProg.model.Category;
import com.team36.webProg.model.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    public final CategoryRepository _categoryRepo;
    public final ProductRepository _productRepo;

    @Autowired
    public CategoryServiceImpl(CategoryRepository _categoryRepo, ProductRepository _productRepo) { 
    	this._categoryRepo = _categoryRepo;
    	this._productRepo = _productRepo;}

	@Override
	public List<Category> searchCategories(String query) {
		
		return _categoryRepo.findByNameContainingIgnoreCase(query);
	}

	@Override
	public List<Product> showProductsByCategory(String category) {
		// TODO Auto-generated method stub
		return _productRepo.findByCategoryContainingIgnoreCase(category);
	}
}
