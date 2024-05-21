package com.team36.webProg.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int rating;
    private String comment;
    private Date reviewDate;

    @ManyToOne(fetch=FetchType.EAGER)
    private Users users;

    public Review(Long id, int rating, String comment, Date reviewDate/*,Users reviewer*/) {
        this.id = id;
        this.rating = rating;
        this.comment = comment;
        this.reviewDate = reviewDate;
        //this.reviewer = reviewer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    /*public Users getReviewer() {
        return reviewer;
    }

    public void setReviewer(Users reviewer) {
        this.reviewer = reviewer;
    }*/
}
