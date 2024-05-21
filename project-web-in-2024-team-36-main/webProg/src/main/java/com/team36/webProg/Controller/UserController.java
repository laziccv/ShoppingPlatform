package com.team36.webProg.Controller;


import com.team36.webProg.iService.UserService;
import com.team36.webProg.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/user")
public class UserController {
    public final UserService _userService;

    @Autowired
    public UserController(UserService _userService) { this._userService = _userService; }

    @GetMapping("/users")
    List<Users> getAllUsers() {
        return _userService.findAll();
    }
}
