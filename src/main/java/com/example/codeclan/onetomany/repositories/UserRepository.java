package com.example.codeclan.onetomany.repositories;

import com.example.codeclan.onetomany.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
