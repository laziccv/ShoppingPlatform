package com.team36.webProg.Repository;

import com.team36.webProg.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Long> {
    public List<Users> findAll();
}
