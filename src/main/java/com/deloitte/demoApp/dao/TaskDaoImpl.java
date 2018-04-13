package com.deloitte.demoApp.dao;

import com.deloitte.demoApp.model.Task;
import com.deloitte.demoApp.model.User;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("taskDao")
public class TaskDaoImpl extends AbstractDao<Integer, Task> implements TaskDao {


    static final Logger logger = LoggerFactory.getLogger(TaskDaoImpl.class);

    @Override
    public void save(Task task) {
        persist(task);
    }

    @Override
    public void del(Task task) {
        System.out.println("DAI IMPL");
        delete(task);
    }

    @Override
    public List<Task> findAll() {

        Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
        List<Task> tasks = (List<Task>) criteria.list();

        return tasks;
    }

    @Override
    public List<Task> findAllUserTask(User user) {

        if (user != null) {
            String hql = "FROM Task p WHERE p.user.id = :userid";
            Query query = getSession().createQuery(hql);
            query.setInteger("userid", user.getId());
            List results = query.list();

            List<Task> tasks = (List<Task>) results;
            return tasks;
        }
        return null;

    }

    @Override
    public Task findById(int id) {

        Task task = getByKey(id);
        return task;
    }
}
