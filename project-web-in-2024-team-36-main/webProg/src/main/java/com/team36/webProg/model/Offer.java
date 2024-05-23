package com.team36.webProg.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Offers")
@Getter @Setter
public class Offer {

	@Id
    @Column(name = "id", unique = true, updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "entity_id_seq")
    @SequenceGenerator(name = "entity_id_seq", sequenceName = "global_id_sequence", allocationSize = 1)
    private Long id;

    @Column
    private long price;
    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private Users users;
    
    public Offer(Long id, long price, Users users) {
    	this.id=id;
    	this.price=price;
    	this.users=users;
    }
    
    public Offer() {}
}
