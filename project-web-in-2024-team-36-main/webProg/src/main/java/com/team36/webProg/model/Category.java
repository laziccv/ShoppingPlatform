package com.team36.webProg.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.*;

@Entity
@Table(name = "Categories")
@Getter @Setter
public class Category {

	@Id
    @Column(name = "id", unique = true, updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "entity_id_seq")
    @SequenceGenerator(name = "entity_id_seq", sequenceName = "global_id_sequence", allocationSize = 1)
    private Long id;

    public String name;

    public Category(Long id,String name) {
        this.id=id;
    	this.name = name;
    }
    
    public Category(){}

   
}
