package com.wyy.dao;

import com.wyy.po.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * Created by dell on 2019/3/9 0009.
 */
public class UserDaoImp implements UserDao {
    private org.hibernate.cfg.Configuration cfg;
    private SessionFactory sessionFactory;
    public  UserDaoImp(){
        cfg = new Configuration().configure("hibernate.cfg.xml");
        sessionFactory = cfg.buildSessionFactory();
    }
    @Override
    public void add(String name, String pwd) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();

        User user = new User();
        user.setUserName(name);
        user.setPassword(pwd);
        session.save(user);
        transaction.commit();
        session.close();
    }

    @Override
    public void queryId(int id) {

    }

    @Override
    public void queryName(String name) {

    }

    @Override
    public void del(String name) {

    }

    @Override
    public void updata(int id) {

    }

    @Override
    public void joinTeam(int uid, int tid) {

    }

    @Override
    public void exitTeam(int uid) {

    }

    @Test
    public void Test(){
        add("XXX","123456");
    }
}
