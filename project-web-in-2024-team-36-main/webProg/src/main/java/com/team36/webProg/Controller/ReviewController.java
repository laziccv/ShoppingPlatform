package com.team36.webProg.Controller;

import com.team36.webProg.iService.ReviewService;
import com.team36.webProg.iService.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/review")
public class ReviewController {
    private final ReviewService _reviewService;

    @Autowired
    public ReviewController(ReviewService _reviewService) { this._reviewService = _reviewService; }
}
