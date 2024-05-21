package com.team36.webProg.model;

import jakarta.persistence.*;
import java.util.Date;


enum saleType{
    FIXED,
    AUCTION
}

@Entity
@Table(name = "Products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
}
