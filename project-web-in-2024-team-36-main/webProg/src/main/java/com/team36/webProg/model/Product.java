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
}
