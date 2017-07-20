package org.bootcamp.ttn.dao;

/**
 * Created by Nitin Jain on 7/20/2017.
 */
public interface ISubscriptionDao {
    void autoSubscribeTopicCreator(Integer topicId,String userName);
}
