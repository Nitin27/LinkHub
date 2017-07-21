package org.bootcamp.ttn.services.impl;

import org.bootcamp.ttn.entities.Topic;
import org.bootcamp.ttn.entities.User;
import org.bootcamp.ttn.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Nitin Jain on 7/22/2017.
 */
@Controller
public class ResourceServiceImpl implements IResourceService {
    @Autowired
    ILinkResourceService linkResourceService;
    @Autowired
    IDocumentResourceService documentResourceService;
    @Autowired
    ITopicService topicService;
    @Autowired
    IUserService userService;

    @Override
    public Boolean addLink(String linkName, String linkDescription, Integer topicId, String userName) {
        Topic topic = topicService.getTopicDetails(topicId);
        User user = userService.getUserId(userName);
        Boolean check = linkResourceService.addLinkResource(topic, linkName, linkDescription, user);
        return true;
    }
}
