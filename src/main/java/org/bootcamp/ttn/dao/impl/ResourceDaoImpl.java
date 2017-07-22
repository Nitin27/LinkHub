package org.bootcamp.ttn.dao.impl;

import org.bootcamp.ttn.dao.IResourceDao;
import org.bootcamp.ttn.entities.Resource;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Nitin Jain on 7/22/2017.
 */
@Repository
@Transactional
public class ResourceDaoImpl implements IResourceDao {
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public List<Resource> getRecentShare() {
        Session session=sessionFactory.getCurrentSession();
        Criteria cr=session.createCriteria(Resource.class);
        cr.addOrder(Order.desc("dateCreated"));
        cr.setMaxResults(5);
        return cr.list();
    }
}
