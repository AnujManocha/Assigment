package com.example.Assigment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Assigment.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByphoneAndEmail(String email, String phone);

}
