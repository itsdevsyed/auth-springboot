package com.speezy.fastcommers.repository;

import org.springframework.stereotype.Repository;
import com.speezy.fastcommers.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
    User findByEmail(String email);

    // Custom query methods can be defined here if needed
}
