package edu.eci.ieti.postgres.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.eci.ieti.postgres.data.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
