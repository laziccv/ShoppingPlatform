package com.team36.webProg.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;



@Entity
@Table(name = "users")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="userType", discriminatorType = DiscriminatorType.STRING)
@Getter @Setter
public class Users implements Serializable {
	@Id
    @Column(name = "id", unique = true, updatable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "entity_id_seq")
    @SequenceGenerator(name = "entity_id_seq", sequenceName = "global_id_sequence", allocationSize = 1)
    private Long id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column(unique = true, nullable = false)
    private String username;
    @Column(unique = true, nullable = false)
    private String email;
    @Column
    private String phNum;
    @JsonIgnore
    @Column
    private String password;
    @Column
    private Date dateOfBirth;
    @Column
    private String userImagePath;
    @Column
    private String description;
    @Column(insertable=false, updatable=false)
    private String userType;
    @Column
    private boolean isBlocked;
    
    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews;
    
    @OneToMany(mappedBy = "reporter", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Report> prijavePodnete;

    @OneToMany(mappedBy = "reported", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Report> prijaveProtiv;

    public Users(Long id, String name, String surname, String username, String email, String phNum, String password, Date dateOfBirth, String userImagePath, String description, String userType, boolean isBlocked) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.email = email;
        this.phNum = phNum;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.userImagePath = userImagePath;
        this.description = description;
        this.userType = userType;
        this.isBlocked = isBlocked;
    }
    public Users(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhNum() {
        return phNum;
    }

    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUserImagePath() {
        return userImagePath;
    }

    public void setUserImagePath(String userImagePath) {
        this.userImagePath = userImagePath;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String description) {
        this.description = description;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
    
    
    
    
      @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phNum='" + phNum + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", userImagePath='" + userImagePath + '\'' +
                ", description='" + description + '\'' +
                ", userType='" + userType + '\'' +
                ", isBlocked='" + isBlocked + '\'' +
                
                '}';
    }
}
