package com.example.authorization.repos;


import com.example.authorization.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends CrudRepository<User, UUID> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    Optional<User> findByPhone(String phone);
    boolean existsUserByEmail(String email);
    boolean existsUserByPhone(String phone);
    boolean existsUserById(String id);
}
