package com.team36.webProg.Controller;


import com.team36.webProg.iService.UsersService;
import com.team36.webProg.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/user")
public class UsersController {
    private final UsersService _usersService;

    //@Autowired
    public UsersController(UsersService _usersService) { this._usersService = _usersService; }

    @GetMapping("/users")
    List<Users> findAll() {
        return _usersService.findAll();
    }
}
