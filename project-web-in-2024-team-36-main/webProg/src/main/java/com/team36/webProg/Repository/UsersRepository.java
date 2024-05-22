package com.team36.webProg.Repository;

import com.team36.webProg.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
     List<Users> findAll();
}
