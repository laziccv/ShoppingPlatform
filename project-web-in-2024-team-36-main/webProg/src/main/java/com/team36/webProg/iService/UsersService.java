package com.team36.webProg.iService;

import com.team36.webProg.model.Users;

import java.util.List;

public interface UsersService {
    List<Users> findAll();
    Users create(Users user) throws Exception;
    Users checkLogin(String username, String password);
}
