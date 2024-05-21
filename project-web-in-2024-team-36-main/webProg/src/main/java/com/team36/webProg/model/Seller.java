package com.team36.webProg.model;
import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@DiscriminatorValue("seller")
public class Seller extends Users{

    @OneToMany(mappedBy="users", fetch=FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Product> productsForSale= new HashSet<>();

    @OneToMany(mappedBy="users", fetch=FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Review> receivedReviews= new HashSet<>();



    /*public Seller(Long id, String name, String surname, String username, String email, String phNum, String password, Date dateOfBirth, String userImagePath, String desc, String userType, boolean isBlocked, List<Product> productsForSale, List<Review> receivedReviews) {
        super(id, name, surname, username, email, phNum, password, dateOfBirth, userImagePath, desc, userType, isBlocked);
        this.productsForSale = productsForSale;
        this.receivedReviews = receivedReviews;
    }*/

    public Set<Product> getProductsForSale() {
        return productsForSale;
    }

    public void setProductsForSale(Set<Product> productsForSale) {
        this.productsForSale = productsForSale;
    }

    public Set<Review> getReceivedReviews() {
        return receivedReviews;
    }

    public void setReceivedReviews(Set<Review> receivedReviews) {
        this.receivedReviews = receivedReviews;
    }
}
