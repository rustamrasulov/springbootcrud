package com.miirrr.springbootcrud.service;

import com.miirrr.springbootcrud.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    void deleteById(Long id);

    User getById(Long id);

    List<User> findAll();
}
