package com.team36.webProg.model;

import jakarta.persistence.*;
import java.util.Date;

enum Status{
    SENT,
    ACCEPTED,
    DENIED
}

@Entity
@Table(name = "Reports")
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String reason;
    @Column
    private Date reportDate;
//    @ManyToOne
//    @JoinColumn(name = "reporter_id")
//    private Users reporter;
//    @ManyToOne
//    @JoinColumn(name = "reported_id")
//    private Users reported;
    @Column
    @Enumerated(EnumType.STRING)
    private Status repStatus;

}
