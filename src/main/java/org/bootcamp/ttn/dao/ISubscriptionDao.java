package org.bootcamp.ttn.dao;

import org.bootcamp.ttn.entities.Topic;
import org.bootcamp.ttn.entities.User;

import java.util.List;

/**
 * Created by Nitin Jain on 7/20/2017.
 */
public interface ISubscriptionDao {
    void autoSubscribeTopicCreator(Integer topicId, String userName);

    List<Topic> fetchSubscribedTopic(User userId);
}
