package org.bootcamp.ttn.dao;

import org.bootcamp.ttn.enums.Visibility;

/**
 * Created by Nitin Jain on 7/20/2017.
 */
public interface ITopicDao {
    Boolean addTopic(String topicName, Visibility topicVisibility,String userName);
    Boolean checkUniqueTopicName(String topicName,String userName);
}
