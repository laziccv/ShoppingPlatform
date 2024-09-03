package com.team36.webProg.Controller;

import com.team36.webProg.iService.ProductService;
import com.team36.webProg.iService.ReportService;
import com.team36.webProg.model.Product;
import com.team36.webProg.model.Users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/product")
public class ProductController {
    private final ProductService _productService;

    @Autowired
    public ProductController(ProductService _productService) { this._productService = _productService; }
    
    @GetMapping("/products")
    List<Product> findAll() {
        return _productService.findAll();
    }
    
    @GetMapping("/pretraga")
    public List<Product> searchProducts(@RequestParam String query) {
        return _productService.searchProducts(query);
    }

    @GetMapping("/filter")
    public List<Product> filterProducts(@RequestParam String query,
                                             @RequestParam(required = false) String category,
                                             @RequestParam(required = false) Double minPrice,
                                             @RequestParam(required = false) Double maxPrice) {
        return _productService.filterProducts(query, category, minPrice, maxPrice);
    } 
}
