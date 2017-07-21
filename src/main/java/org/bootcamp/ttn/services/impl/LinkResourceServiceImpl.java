package org.bootcamp.ttn.services.impl;

import org.bootcamp.ttn.dao.ILinkResourceDao;
import org.bootcamp.ttn.entities.Topic;
import org.bootcamp.ttn.entities.User;
import org.bootcamp.ttn.services.ILinkResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Nitin Jain on 7/22/2017.
 */
@Controller
public class LinkResourceServiceImpl implements ILinkResourceService {
    @Autowired
    ILinkResourceDao linkResourceDao;

    @Override
    public Boolean addLinkResource(Topic topic, String linkName, String linkDescription, User user) {
        return linkResourceDao.addLink(topic, linkName, linkDescription, user);
    }
}
