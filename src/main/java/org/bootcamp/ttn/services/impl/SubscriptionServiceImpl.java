package org.bootcamp.ttn.services.impl;

import org.bootcamp.ttn.dao.ISubscriptionDao;
import org.bootcamp.ttn.services.ISubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SubscriptionServiceImpl implements ISubscriptionService{
    @Autowired
    ISubscriptionDao subscriptionDao;
    @Override
    public void autoSubscribeTopicCreator(Integer topicId, String userName) {
        subscriptionDao.autoSubscribeTopicCreator(topicId,userName);
    }
}
