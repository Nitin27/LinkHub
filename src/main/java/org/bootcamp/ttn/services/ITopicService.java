package org.bootcamp.ttn.services;

import org.springframework.stereotype.Service;

/**
 * Created by Nitin Jain on 7/20/2017.
 */

public interface ITopicService {
    Boolean addTopic(String topicName,String visibility,String userName);
}
