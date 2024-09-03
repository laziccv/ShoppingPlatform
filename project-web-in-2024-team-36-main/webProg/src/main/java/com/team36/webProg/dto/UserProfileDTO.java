package com.team36.webProg.dto;

import java.util.List;

import com.team36.webProg.model.Product;
import com.team36.webProg.model.Review;
import com.team36.webProg.model.Users;

import lombok.Getter;
import lombok.Setter;

public class UserProfileDTO {

	@Getter @Setter
	private Users user;
	@Getter @Setter
    private List<Product> products;
	@Getter @Setter
    private List<Review> reviews;
	@Getter @Setter
    private int rating;
	
	public UserProfileDTO() {}
	
	public UserProfileDTO(Users user, List products, List reviews, int rating) {
		this.user = user;
		this.products = products;
		this.reviews = reviews;
		this.rating = rating;
	}
}
