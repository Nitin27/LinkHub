package org.bootcamp.ttn.services;

import org.bootcamp.ttn.dto.UserSubscribedTopicDto;
import org.bootcamp.ttn.entities.Topic;

import java.util.List;

/**
 * Created by Nitin Jain on 7/20/2017.
 */
public interface ISubscriptionService {
    void autoSubscribeTopicCreator(Integer topicId,String userName);
    List<UserSubscribedTopicDto> fetchUserSubscribedTopic(String userName);
}
