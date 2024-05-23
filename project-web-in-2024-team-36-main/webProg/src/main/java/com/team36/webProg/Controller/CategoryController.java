package com.team36.webProg.Controller;

import com.team36.webProg.iService.CategoryService;
import com.team36.webProg.iService.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/category")
public class CategoryController {
    private final CategoryService _categoryService;

    @Autowired
    public CategoryController(CategoryService _categoryService) { this._categoryService = _categoryService; }
}
