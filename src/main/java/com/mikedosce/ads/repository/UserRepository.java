package com.mikedosce.ads.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mikedosce.ads.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	
}
