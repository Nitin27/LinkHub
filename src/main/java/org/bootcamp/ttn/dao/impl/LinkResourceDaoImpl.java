package org.bootcamp.ttn.dao.impl;

import org.bootcamp.ttn.dao.ILinkResourceDao;
import org.bootcamp.ttn.entities.LinkResource;
import org.bootcamp.ttn.entities.Topic;
import org.bootcamp.ttn.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by Nitin Jain on 7/22/2017.
 */
@Repository
@Transactional
public class LinkResourceDaoImpl implements ILinkResourceDao {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Boolean addLink(Topic topic, String linkName, String linkDescription,User user) {
        Session session=sessionFactory.getCurrentSession();
        LinkResource linkResource=new LinkResource();
        linkResource.setUrl(linkName);
        linkResource.setDateCreated(new Date());
        linkResource.setDateUpdated(new Date());
        linkResource.setDescription(linkDescription);
        linkResource.setTopic(topic);
        linkResource.setUser(user);
        session.save(linkResource);
        return true;
    }
}
