package com.team36.webProg.Controller;

import com.team36.webProg.iService.ProductService;
import com.team36.webProg.iService.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/product")
public class ProductController {
    private final ProductService _productService;

    @Autowired
    public ProductController(ProductService _productService) { this._productService = _productService; }
}
