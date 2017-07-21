package org.bootcamp.ttn.services;

import org.bootcamp.ttn.entities.Topic;

/**
 * Created by Nitin Jain on 7/20/2017.
 */

public interface ITopicService {
    Boolean addTopic(String topicName, String visibility, String userName);

    Boolean isTopicNamePresent(String topicName, String userName);

    Topic getTopicDetails(Integer topicId);
}
