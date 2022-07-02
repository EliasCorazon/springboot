package com.example.service;

import com.example.model.User;

import java.util.List;

public interface UserService {
    public List<User> allUsers();
    public User findById(Long id);
    public User addUser(User addUser);
    public void delete(Long id);

}
