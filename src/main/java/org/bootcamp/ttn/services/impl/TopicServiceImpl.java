package org.bootcamp.ttn.services.impl;

import org.bootcamp.ttn.dao.ITopicDao;
import org.bootcamp.ttn.entities.Topic;
import org.bootcamp.ttn.enums.Visibility;
import org.bootcamp.ttn.services.ISubscriptionService;
import org.bootcamp.ttn.services.ITopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Nitin Jain on 7/20/2017.
 */

@Service
public class TopicServiceImpl implements ITopicService {
    @Autowired
    ITopicDao topicDao;

    @Autowired
    ISubscriptionService subscriptionService;

    @Override
    public Boolean addTopic(String topicName, String visibility, String userName) {
        Visibility topicVisibility;
        if(visibility.equals("0"))
            topicVisibility=Visibility.PUBLIC;
        else
            topicVisibility=Visibility.PRIVATE;

        Integer topicId = topicDao.addTopic(topicName,topicVisibility,userName);
        if (topicId==0)
            return false;
        else{
            subscriptionService.autoSubscribeTopicCreator(topicId,userName);
            return true;
        }
    }

    @Override
    public Boolean isTopicNamePresent(String topicName, String userName) {
        return topicDao.checkUniqueTopicName(topicName,userName);
    }


    @Override
    public Topic getTopicDetails(Integer topicId) {
        Topic topic = topicDao.getTopicDetails(topicId);
        return topic;
    }
}
