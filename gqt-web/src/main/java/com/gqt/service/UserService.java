package com.gqt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gqt.dao.UserDAO;
import com.gqt.model.User;


import com.gqt.dao.UserDAO;

@Service
public class UserService {
    @Autowired private UserDAO userDAO; 

    public List<User> findAll()  
    {
        return this.userDAO.findAll();
        //return null;
    }
}
