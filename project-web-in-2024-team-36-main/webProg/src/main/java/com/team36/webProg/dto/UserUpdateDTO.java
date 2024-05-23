package com.team36.webProg.dto;

import java.util.Date;

import com.team36.webProg.model.Users;

import lombok.Getter;
import lombok.Setter;

public class UserUpdateDTO {
	
	@Getter @Setter
	private Long id;
	@Getter @Setter
    private String name;
	@Getter @Setter
    private String surname;
	@Getter @Setter
    private String username;
	@Getter @Setter
    private String email;
	@Getter @Setter
    private String phNum;
	@Getter @Setter
    private String password;   
    private Date dateOfBirth;
    @Getter @Setter
    private String userImagePath;
    @Getter @Setter
    private String desc;
    
    UserUpdateDTO(){}
    
    public UserUpdateDTO(Users user){
    	this.id = id;
    	this.name = name;
    	this.surname = surname;
    	this.username = username;
    	this.email = email;
    	this.phNum = phNum;
    	this.password = password;
    	this.dateOfBirth = dateOfBirth;
    	this.userImagePath = userImagePath;
    	this.desc = desc;
    	
    }
    

}
