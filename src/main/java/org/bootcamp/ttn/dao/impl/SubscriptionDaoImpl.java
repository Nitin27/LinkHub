package org.bootcamp.ttn.dao.impl;

import org.bootcamp.ttn.dao.ISubscriptionDao;
import org.bootcamp.ttn.entities.Subscription;
import org.bootcamp.ttn.entities.Topic;
import org.bootcamp.ttn.entities.User;
import org.bootcamp.ttn.enums.Seriousness;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Nitin Jain on 7/20/2017.
 */
@Transactional
@Repository
public class SubscriptionDaoImpl implements ISubscriptionDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void autoSubscribeTopicCreator(Integer topicId, String userName) {
        Session session = sessionFactory.getCurrentSession();
        @SuppressWarnings("JpaQlInspection") String hql1 = "FROM Topic WHERE topicId=:topicId";
        @SuppressWarnings("JpaQlInspection") String hql2 = "FROM User WHERE userName=:userName";
        Query query = session.createQuery(hql1);
        query.setParameter("topicId", topicId);
        Query query2 = session.createQuery(hql2);
        query2.setParameter("userName", userName);
        Topic topic = (Topic) query.uniqueResult();
        User user = (User) query2.uniqueResult();
        Subscription subscription = new Subscription();
        subscription.setDateCreated(new Date());
        subscription.setDateUpdated(new Date());
        subscription.setSeriousness(Seriousness.VERY_SERIOUS);
        subscription.setTopic(topic);
        subscription.setUser(user);
        topic.getSubscriptions().add(subscription);
        session.save(subscription);
        session.saveOrUpdate(topic);
    }

    @Override
    public List<Topic> fetchSubscribedTopic(User user) {
        Session session = sessionFactory.getCurrentSession();
        @SuppressWarnings("JpaQlInspection") String hql = "FROM Subscription s WHERE s.user = :user";
        Query query = session.createQuery(hql);
        query.setParameter("user", user);
        List list = query.list();
        List<Topic> topicList = new ArrayList<Topic>();
        Iterator i = list.iterator();
        Subscription s;
        while (i.hasNext()) {
            s = (Subscription) i.next();
            topicList.add(s.getTopic());
        }
        return list;
    }
}
