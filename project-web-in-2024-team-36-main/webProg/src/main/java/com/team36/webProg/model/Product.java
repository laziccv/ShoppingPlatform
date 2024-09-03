package com.team36.webProg.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;


enum saleType{
    FIXED,
    AUCTION
}

@Entity
@Table(name = "Products")
@Getter @Setter
public class Product {

	@Id
    @Column(name = "id", unique = true, updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "entity_id_seq")
    @SequenceGenerator(name = "entity_id_seq", sequenceName = "global_id_sequence", allocationSize = 1)
    private Long id;

    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String imagePath;
    @Column
    private Double price;
    @Column
    private String category;
    @Column
    @Enumerated(EnumType.STRING)
    private saleType sType;
    @Column
    private Date postingDate;
    @Column
    private boolean isSold;
    @Column
    private boolean reviewedByBuyer;
    @Column
    private boolean reviewedBySeller;

    @ManyToOne(fetch=FetchType.EAGER)
    private Users users;
    
    public Product(Long id, String name, String description, String imagePath, Double price, String category, saleType sType, Date postingDate, boolean isSold, boolean reviewedByBuyer, boolean reviewedBySeller) {
    	this.id=id;
    	this.name=name;
    	this.description=description;
    	this.imagePath=imagePath;
    	this.price=price;
    	this.category=category;
    	this.sType=sType;
    	this.postingDate=postingDate;
    	this.isSold=isSold;
    	this.reviewedByBuyer=reviewedByBuyer;
    	this.reviewedBySeller=reviewedBySeller;
    }
    
    public Product() {}
    
    
       @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", price='" + price + '\'' +
                ", category='" + category + '\'' +
                ", sType='" + sType + '\'' +
                ", postingDate='" + postingDate + '\'' +
                ", isSold='" + isSold + '\'' +
                ", reviewedByBuyer='" + reviewedByBuyer + '\'' +
                ", reviewedBySeller='" + reviewedBySeller + '\'' +
                
                
                '}';
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public saleType getsType() {
		return sType;
	}

	public void setsType(saleType sType) {
		this.sType = sType;
	}

	public Date getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(Date postingDate) {
		this.postingDate = postingDate;
	}

	public boolean isSold() {
		return isSold;
	}

	public void setSold(boolean isSold) {
		this.isSold = isSold;
	}

	public boolean isReviewedByBuyer() {
		return reviewedByBuyer;
	}

	public void setReviewedByBuyer(boolean reviewedByBuyer) {
		this.reviewedByBuyer = reviewedByBuyer;
	}

	public boolean isReviewedBySeller() {
		return reviewedBySeller;
	}

	public void setReviewedBySeller(boolean reviewedBySeller) {
		this.reviewedBySeller = reviewedBySeller;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
       
    
    
}
