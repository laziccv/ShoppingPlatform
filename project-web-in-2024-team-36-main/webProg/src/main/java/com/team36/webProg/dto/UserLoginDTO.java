package com.team36.webProg.dto;

import lombok.Getter;
import lombok.Setter;

public class UserLoginDTO {

	@Getter @Setter
    private String username;
    @Getter @Setter
    private String password;

    public UserLoginDTO() {}

    public UserLoginDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
