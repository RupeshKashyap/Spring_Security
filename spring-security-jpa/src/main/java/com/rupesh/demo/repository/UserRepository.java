package com.rupesh.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.rupesh.demo.models.User;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Integer> {
		Optional<User>	findByUserName(String userNAme);
	
}
