package com.gqt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gqt.dao.MessageDAO;


@Service
 public class WelcomeService {
    @Autowired MessageDAO messageDAO;
    public Object getMessage()
    {
        return messageDAO.getHelloWorld();
    }
 }





