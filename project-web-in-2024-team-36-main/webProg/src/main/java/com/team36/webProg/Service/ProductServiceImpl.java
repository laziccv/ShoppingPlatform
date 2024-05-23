package com.team36.webProg.Service;

import com.team36.webProg.Repository.ProductRepository;
import com.team36.webProg.Repository.UsersRepository;
import com.team36.webProg.iService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    public final ProductRepository _productRepo;

    @Autowired
    public ProductServiceImpl(ProductRepository _productRepo) { this._productRepo = _productRepo; }
}
