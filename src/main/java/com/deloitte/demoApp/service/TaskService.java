package com.deloitte.demoApp.service;

import com.deloitte.demoApp.model.Task;
import com.deloitte.demoApp.model.User;

import java.util.List;


public interface TaskService {

    Task findById(int id);

    Task findBySSO(String sso);

    void saveTask(Task task);

    void updateTask(Task task);

    void deleteTask(Task task);

    List<Task> findAllTasks();

    List<Task> findAllUserTasks(User user);

}