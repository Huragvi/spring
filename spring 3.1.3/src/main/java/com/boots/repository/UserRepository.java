package com.boots.repository;

import com.boots.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
//    List<User> getAllUsers ();
//    User getUserById(long id);
//    void addUser(User user);
//    void removeUser(long id);
//    void updateUser(User user);
}
