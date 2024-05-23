package com.team36.webProg.Controller;


import com.team36.webProg.dto.UserLoginDTO;
import com.team36.webProg.iService.UsersService;
import com.team36.webProg.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/user")
public class UsersController {
    private final UsersService _usersService;

    @Autowired
    public UsersController(UsersService _usersService) { this._usersService = _usersService; }

    @GetMapping("/users")
    List<Users> findAll() {
        return _usersService.findAll();
    }
    
    @PostMapping(value= "/create",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Users> createUser(@RequestBody Users user) {
        Users savedUser = null;
        try {
            savedUser = _usersService.create(user);
            return new ResponseEntity<Users>(savedUser, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<Users>(savedUser, HttpStatus.CONFLICT);
        }
    }
    
    @PostMapping(value="/login",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Users> checkLogin(@RequestBody UserLoginDTO userLoginDTO) {

        Users user_info = _usersService.checkLogin(userLoginDTO.getUsername(), userLoginDTO.getPassword());
        System.out.println("User check Login returned: " + user_info );
        if (user_info == null) {
            return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Users>(user_info, HttpStatus.OK);
    }
}
