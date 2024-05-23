package com.team36.webProg.Service;

import com.team36.webProg.Repository.CategoryRepository;
import com.team36.webProg.Repository.UsersRepository;
import com.team36.webProg.iService.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    public final CategoryRepository _categoryRepo;

    @Autowired
    public CategoryServiceImpl(CategoryRepository _categoryRepo) { this._categoryRepo = _categoryRepo; }
}
