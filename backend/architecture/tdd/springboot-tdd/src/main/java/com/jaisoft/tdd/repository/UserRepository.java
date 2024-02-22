package com.jaisoft.tdd.repository;



import com.jaisoft.tdd.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Long>  {
   
}
