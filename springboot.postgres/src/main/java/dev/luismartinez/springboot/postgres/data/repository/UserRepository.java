package dev.luismartinez.springboot.postgres.data.repository;

import dev.luismartinez.springboot.postgres.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}