package com.deloitte.demoApp.service;

import com.deloitte.demoApp.dao.TaskDao;

import com.deloitte.demoApp.model.Task;

import com.deloitte.demoApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("taskService")
@Transactional
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskDao dao;

    @Override
    public Task findById(int id) {
        return dao.findById(id);
    }

    @Override
    public Task findBySSO(String sso) {
        return null;
    }

    @Override
    public void saveTask(Task task) {
        dao.save(task);
    }

    @Override
    public void updateTask(Task task) {
        Task entity = dao.findById(task.getId());
        if (entity != null) {
            entity.setDone(task.getDone());
            entity.setName(task.getName());
            entity.setLastUpdate(task.getLastUpdate());
        }
    }

    @Override
    public void deleteTask(Task task) {
        dao.del(task);
    }

    @Override
    public List<Task> findAllTasks() {
        return dao.findAll();
    }

    @Override
    public List<Task> findAllUserTasks(User user) {
        return dao.findAllUserTask(user);
    }


}
