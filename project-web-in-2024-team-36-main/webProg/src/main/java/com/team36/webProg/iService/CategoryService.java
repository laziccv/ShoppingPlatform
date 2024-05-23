package com.team36.webProg.iService;
import java.util.List;

import com.team36.webProg.model.Category;
import com.team36.webProg.model.Product;

public interface CategoryService {
	
	 List<Category> searchCategories(String query);
	
	 List<Product> showProductsByCategory(String category);
}
