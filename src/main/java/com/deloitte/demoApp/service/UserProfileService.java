package com.deloitte.demoApp.service;

import java.util.List;

import com.deloitte.demoApp.model.UserProfile;


public interface UserProfileService {

    UserProfile findById(int id);

    UserProfile findByType(String type);

    List<UserProfile> findAll();

}
