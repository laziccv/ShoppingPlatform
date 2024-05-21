package com.team36.webProg.Repository;

import com.team36.webProg.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    public List<Users> findAll();
}
