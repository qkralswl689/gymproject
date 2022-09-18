package com.gym.project.user.repository;

import com.gym.project.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {

   // public Integer findByUserIndex(String email);

//    public UserEntity findByEmail(String email);
//
//    public List<UserEntity> findAll();
}
