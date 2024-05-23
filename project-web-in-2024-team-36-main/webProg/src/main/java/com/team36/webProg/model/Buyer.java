package com.team36.webProg.model;
import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@DiscriminatorValue("BUYER")
public class Buyer extends Users{
    @OneToMany(mappedBy="users", fetch=FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Product> purchasedProducts= new HashSet<>();

    @OneToMany(mappedBy="users", fetch=FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Review> receivedReviews= new HashSet<>();

    public Buyer(Long id, String name, String surname, String username, String email, String phNum, String password, Date dateOfBirth, String userImagePath, String desc, String userType, boolean isBlocked, Set<Product> purchasedProducts, Set<Review> receivedReviews) {
        super(id, name, surname, username, email, phNum, password, dateOfBirth, userImagePath, desc, userType, isBlocked);
        this.purchasedProducts = purchasedProducts;
        this.receivedReviews = receivedReviews;
    }
    public Buyer(){
        super();
    }

    public Set<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(Set<Product> purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public Set<Review> getReceivedReviews() {
        return receivedReviews;
    }

    public void setReceivedReviews(Set<Review> receivedReviews) {
        this.receivedReviews = receivedReviews;
    }
}
