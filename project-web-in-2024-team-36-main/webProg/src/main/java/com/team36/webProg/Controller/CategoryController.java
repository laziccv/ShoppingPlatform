package com.team36.webProg.Controller;

import com.team36.webProg.iService.CategoryService;
import com.team36.webProg.iService.OfferService;
import com.team36.webProg.model.Category;
import com.team36.webProg.model.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/category")
public class CategoryController {
    private final CategoryService _categoryService;

    @Autowired
    public CategoryController(CategoryService _categoryService) { this._categoryService = _categoryService; }
    
    @GetMapping("/search")
    public List<Category> searchCategories(@RequestParam String query) {
        return _categoryService.searchCategories(query); 
    }

    @GetMapping("/show")
    public List<Product> showProductsByCategory(@RequestParam String category) {
        return _categoryService.showProductsByCategory(category); 
    }
}
