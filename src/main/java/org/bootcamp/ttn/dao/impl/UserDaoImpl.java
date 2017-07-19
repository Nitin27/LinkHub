package org.bootcamp.ttn.dao.impl;

import org.bootcamp.ttn.dao.IUserDao;
import org.bootcamp.ttn.dto.UserLoginDto;
import org.bootcamp.ttn.dto.UserRegisterDto;
import org.bootcamp.ttn.dto.UserSessionDto;
import org.bootcamp.ttn.entities.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements IUserDao {
    @Autowired
    private SessionFactory sessionFactory;

    public Boolean registerUser(UserRegisterDto userRegisterDto) {
        Session session = sessionFactory.getCurrentSession();
        User user = new User();
        try {
            user.setActive(true);
            user.setAdmin(false);
            user.setDateCreated(new Date());
            user.setDateUpdated(new Date());
            user.setEmail(userRegisterDto.getMail());
            user.setFirstName(userRegisterDto.getFirstName());
            user.setLastName(userRegisterDto.getLastName());
            user.setUserName(userRegisterDto.getUserName());
            user.setUserPassword(userRegisterDto.getUserPassword());
            Integer id = (Integer) session.save(user);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public User validateUser(UserLoginDto userLoginDto) {
        List<User> list = new ArrayList<User>();
        Session session = sessionFactory.getCurrentSession();
        @SuppressWarnings("JpaQlInspection") String hql = "FROM User WHERE userName = :userName AND userPassword = :userPassword";
        Query query = session.createQuery(hql);
        query.setParameter("userName", userLoginDto.getTxtUserName());
        query.setParameter("userPassword", userLoginDto.getTxtPassword());
        User user = (User) query.uniqueResult();
        if (user == null) {
            return null;
        } else
            return user;
    }


    public Boolean isUserNamePresent(String userName) {
        List<User> list = new ArrayList<User>();
        Session session = sessionFactory.getCurrentSession();
        @SuppressWarnings("JpaQlInspection") String hql = "FROM User WHERE userName = :userName";
        Query query = session.createQuery(hql);
        query.setParameter("userName", userName);
        if (query.list().isEmpty()) {
            return false;
        } else
            return true;
    }

    public Boolean isUserMailPresent(String userMail) {
        List<User> list = new ArrayList<User>();
        Session session = sessionFactory.getCurrentSession();
        @SuppressWarnings("JpaQlInspection") String hql = "FROM User WHERE email = :userMail";
        Query query = session.createQuery(hql);
        query.setParameter("userMail", userMail);
        if (query.list().isEmpty()) {
            return false;
        } else
            return true;
    }

    public User getUserDetails(String userName){
        Session session = sessionFactory.getCurrentSession();
        @SuppressWarnings("JpaQlInspection") String hql = "FROM User WHERE userName = :userName";
        Query query = session.createQuery(hql);
        query.setParameter("userName", userName);
        return (User)query.uniqueResult();
    }
}
