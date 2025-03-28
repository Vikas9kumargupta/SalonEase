package com.vikas.service;

import com.vikas.exception.UserException;
import com.vikas.model.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(Long id) throws UserException;
    List<User> getAllUsers();
    String deleteUser(Long id) throws UserException;
    User updateUser(long id, User user) throws UserException;
}
