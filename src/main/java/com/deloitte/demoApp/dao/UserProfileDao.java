package com.deloitte.demoApp.dao;

import java.util.List;

import com.deloitte.demoApp.model.UserProfile;


public interface UserProfileDao {

    List<UserProfile> findAll();

    UserProfile findByType(String type);

    UserProfile findById(int id);
}
