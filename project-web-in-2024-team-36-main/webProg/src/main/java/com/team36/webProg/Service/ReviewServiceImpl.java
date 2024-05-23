package com.team36.webProg.Service;

import com.team36.webProg.Repository.ReviewRepository;
import com.team36.webProg.Repository.UsersRepository;
import com.team36.webProg.iService.ReviewService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ReviewServiceImpl implements ReviewService {

    public final ReviewRepository _reviewRepo;

    @Autowired
    public ReviewServiceImpl(ReviewRepository _reviewRepo) { this._reviewRepo = _reviewRepo; }
}
