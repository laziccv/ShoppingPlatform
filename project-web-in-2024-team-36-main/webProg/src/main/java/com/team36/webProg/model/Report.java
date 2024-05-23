package com.team36.webProg.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

enum Status{
    SENT,
    ACCEPTED,
    DENIED
}

@Entity
@Table(name = "Reports")
@Getter @Setter
public class Report {

	@Id
    @Column(name = "id", unique = true, updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "entity_id_seq")
    @SequenceGenerator(name = "entity_id_seq", sequenceName = "global_id_sequence", allocationSize = 1)
    private Long id;

    @Column
    private String reason;
    @Column
    private Date reportDate;
    
    @ManyToOne
    @JoinColumn(name = "reporter_id", nullable = false)
    private Users reporter;

    @ManyToOne
    @JoinColumn(name = "reported_id", nullable = false)
    private Users reported;
    @Column
    @Enumerated(EnumType.STRING)
    private Status repStatus;
    
    public Report(Long id, String reason, Date reportDate, Status repStatus, Users reporter, Users reported) {
    	this.id=id;
    	this.reason=reason;
    	this.reportDate=reportDate;
    	this.repStatus=repStatus;
    	this.reporter = reporter;
    	this.reported = reported;
    }
    
    public Report() {}

}
