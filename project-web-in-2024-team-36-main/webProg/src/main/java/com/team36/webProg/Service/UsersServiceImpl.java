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

	@Override
	public Users create(Users user) throws Exception {
		
        Users newUser = this._usersRepo.save(user);
        return newUser;
	}

	@Override
	public Users checkLogin(String username, String password) {
		Users user = this._usersRepo.findOneByUsernameAndPassword(username,password);
        return user;
	}

	@Override
	public Users findOneById(Long id) {
		
		Users user = this._usersRepo.findOneById(id);
        return  user;
	}

	@Override
	public Users update(Users user) throws Exception {
		Users userToUpdate = this._usersRepo.findOneById(user.getId());

        if(userToUpdate == null){
            throw new Exception("User does not exist");
        }

        
        userToUpdate.setName(user.getName());
        userToUpdate.setSurname(user.getSurname());
        //userToUpdate.setEmail(user.getEmail());
        userToUpdate.setPassword(user.getPassword());
        userToUpdate.setPhNum(user.getPhNum());
        userToUpdate.setDateOfBirth(user.getDateOfBirth());
        userToUpdate.setDesc(user.getDesc());
        userToUpdate.setUserImagePath(user.getUserImagePath());
        

        Users updatedUser = _usersRepo.save(userToUpdate);

        return updatedUser;
	}

}

