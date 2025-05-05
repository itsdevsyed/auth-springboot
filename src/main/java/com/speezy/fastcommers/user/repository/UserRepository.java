package com.speezy.fastcommers.user.repository;

import com.speezy.fastcommers.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {



    boolean existsByEmail(String email);
    Optional<User> findByEmail(String email);
    boolean existsByphoneNumber(String phoneNumber);
    Optional<User> findByPhoneNumber(String phoneNumber);

}
