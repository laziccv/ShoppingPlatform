package com.team36.webProg.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Entity
@Table(name = "Reviews")
@Getter @Setter
public class Review {

	@Id
    @Column(name = "id", unique = true, updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "entity_id_seq")
    @SequenceGenerator(name = "entity_id_seq", sequenceName = "global_id_sequence", allocationSize = 1)
    private Long id;
	
	@Column
    private int rating;
	@Column
    private String comment;
	@Column
    private Date reviewDate;

	 @ManyToOne
	    @JoinColumn(name = "user_id", nullable = false)
	    private Users users;

    public Review(Long id, int rating, String comment, Date reviewDate, Users users) {
        this.id = id;
        this.rating = rating;
        this.comment = comment;
        this.reviewDate = reviewDate;
        this.users = users;
        
    }
    
    public Review() {}

    /*public Long getId() {
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

    public Users getReviewer() {
        return users;
    }

    public void setReviewer(Users users) {
        this.users = users;
    }*/
}
