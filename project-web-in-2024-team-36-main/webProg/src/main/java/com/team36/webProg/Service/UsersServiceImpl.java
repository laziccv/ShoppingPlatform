package com.team36.webProg.Service;

import com.team36.webProg.Repository.UsersRepository;
import com.team36.webProg.iService.UsersService;
import com.team36.webProg.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    public final UsersRepository _usersRepo;

    @Autowired
    public UsersServiceImpl(UsersRepository _usersRepo) { this._usersRepo = _usersRepo; }

    @Override
    public List<Users> findAll() {
        return _usersRepo.findAll();
    }

}

