package com.team36.webProg.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Offers")
public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private long price;
    /*@ManyToOne
    @JoinColumn(name = "buyer_id")
    private Users buyer;*/
}
