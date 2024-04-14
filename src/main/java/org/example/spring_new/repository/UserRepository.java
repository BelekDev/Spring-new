package org.example.spring_new.repository;

import org.example.spring_new.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
