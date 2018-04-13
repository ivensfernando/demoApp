package com.deloitte.demoApp.dao;

import java.util.List;

import com.deloitte.demoApp.model.User;


public interface UserDao {

    User findById(int id);

    User findBySSO(String sso);

    void save(User user);

    void deleteBySSO(String sso);

    List<User> findAllUsers();

}

