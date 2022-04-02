package com.miirrr.springbootcrud.dao;

import com.miirrr.springbootcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
}
