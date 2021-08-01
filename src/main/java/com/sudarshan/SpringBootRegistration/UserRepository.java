package com.sudarshan.SpringBootRegistration;

import com.sudarshan.SpringBootRegistration.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
