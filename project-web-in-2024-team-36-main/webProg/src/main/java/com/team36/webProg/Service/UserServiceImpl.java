package com.team36.webProg.Service;

import com.team36.webProg.Repository.UserRepository;
import com.team36.webProg.iService.UserService;
import com.team36.webProg.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    public final UserRepository _userRepo;

    @Autowired
    public UserServiceImpl(UserRepository _userRepo) { this._userRepo = _userRepo; }

    @Override
    public List<Users> findAll() {
        List<Users> users = _userRepo.findAll();
        return users;
    }

}
