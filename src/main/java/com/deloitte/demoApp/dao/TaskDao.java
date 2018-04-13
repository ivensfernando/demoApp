package com.deloitte.demoApp.dao;

import com.deloitte.demoApp.model.Task;
import com.deloitte.demoApp.model.User;


import java.util.List;

public interface TaskDao {

    void save(Task task);

    void del(Task task);

    List<Task> findAll();

    List<Task> findAllUserTask(User user);

    Task findById(int id);

}
