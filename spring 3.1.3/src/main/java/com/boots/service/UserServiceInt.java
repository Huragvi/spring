package com.boots.service;

import com.boots.entity.User;

import java.util.List;

interface UserServiceInt {
    List<User> getAllUsers ();
    Object getUserById(long id);
    void addUser(User user);
    void removeUser(long id);
    void updateUser(User user);
}

