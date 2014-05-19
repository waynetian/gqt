package com.gqt.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gqt.model.User;

@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class UserDAO {
    @Autowired private SessionFactory sessionFactory;
 
    @Transactional
    public List<User> findAll() {
        Session session = this.sessionFactory.getCurrentSession();
        List lstUser = session.createQuery("from User").list();
        return lstUser;
    }
 }

