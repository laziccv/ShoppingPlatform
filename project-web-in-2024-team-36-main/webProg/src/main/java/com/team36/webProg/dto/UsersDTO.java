package com.team36.webProg.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class UsersDTO {
	
	private Long id;
    private String name;    
    private String surname;    
    private String username;    
    private String email;   
    private String phNum;   
    private String password;   
    private Date dateOfBirth;   
    private String userImagePath;   
    private String description;  
    private String userType;    
    private boolean isBlocked;
    
    public UsersDTO() {}
    
    public UsersDTO(Long id, String name, String surname, String username, String email, String phNum, String password, String userType){
    	this.id = id;
    	this.name = name;
    	this.surname = surname;
    	this.username = username;
    	this.email = email;
    	this.phNum = phNum;
    	this.password = password;
    	this.userType = userType;
    }
    
    public UsersDTO(String name, String surname, String username, String email, String phNum, String password, String userType){
    	this.name = name;
    	this.surname = surname;
    	this.username = username;
    	this.email = email;
    	this.phNum = phNum;
    	this.password = password;
    	this.userType = userType;
    }
    
    

}
