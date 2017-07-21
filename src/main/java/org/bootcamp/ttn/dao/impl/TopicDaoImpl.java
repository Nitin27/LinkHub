package org.bootcamp.ttn.dao.impl;

import org.bootcamp.ttn.dao.ITopicDao;
import org.bootcamp.ttn.entities.Topic;
import org.bootcamp.ttn.entities.User;
import org.bootcamp.ttn.enums.Visibility;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;


@Transactional
@Repository
public class TopicDaoImpl implements ITopicDao {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Integer addTopic(String topicName, Visibility topicVisibility, String userName) {
        Integer topicId;
        try {
            Session session = sessionFactory.getCurrentSession();

            @SuppressWarnings("JpaQlInspection") String hql = "FROM User WHERE userName = :userName";
            Query query = session.createQuery(hql);
            query.setParameter("userName", userName);
            User user = (User) query.uniqueResult();
            Topic topic = new Topic();
            topic.setTopicName(topicName);
            topic.setVisibility(topicVisibility);
            topic.setUser(user);
            topic.setDateCreated(new Date());
            topic.setDateUpdated(new Date());
            user.getTopics().add(topic);
            topicId = (Integer) session.save(topic);
            session.saveOrUpdate(user);
            return topicId;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public Boolean checkUniqueTopicName(String topicName, String userName) {
        Session session = sessionFactory.getCurrentSession();
        @SuppressWarnings("JpaQlInspection") String hql = "FROM User u INNER JOIN FETCH u.topics t WHERE u.userName = :userName AND t.topicName=:topicName";
        Query query = session.createQuery(hql);
        query.setParameter("userName", userName);
        query.setParameter("topicName", topicName);
        Object o = query.uniqueResult();
        System.out.println(o);
        if (o == null)
            return false;
        else
            return true;
    }


    @Override
    public Topic getTopicDetails(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Topic topic = (Topic) session.get(Topic.class, id);
        return topic;
    }
}
