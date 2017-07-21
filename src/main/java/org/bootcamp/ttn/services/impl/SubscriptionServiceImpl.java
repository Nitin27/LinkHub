package org.bootcamp.ttn.services.impl;

import org.bootcamp.ttn.dao.ISubscriptionDao;
import org.bootcamp.ttn.dto.UserSubscribedTopicDto;
import org.bootcamp.ttn.entities.Subscription;
import org.bootcamp.ttn.entities.User;
import org.bootcamp.ttn.services.ISubscriptionService;
import org.bootcamp.ttn.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@Service
public class SubscriptionServiceImpl implements ISubscriptionService {
    @Autowired
    ISubscriptionDao subscriptionDao;

    @Autowired
    IUserService userSevice;

    @Override
    public void autoSubscribeTopicCreator(Integer topicId, String userName) {
        subscriptionDao.autoSubscribeTopicCreator(topicId, userName);
    }

    @Override
    public List<UserSubscribedTopicDto> fetchUserSubscribedTopic(String userName) {
        User userId = userSevice.getUserId(userName);
        List topicList = subscriptionDao.fetchSubscribedTopic(userId);
        List<UserSubscribedTopicDto> subscribedTopicDtoArrayList = new ArrayList<UserSubscribedTopicDto>();
        Iterator topicListIterator = topicList.iterator();
        Subscription subscription;
        Integer topicId;
        String topicName;
        while (topicListIterator.hasNext()) {
            subscription = (Subscription) topicListIterator.next();
            topicId = subscription.getTopic().getTopicId();
            topicName = subscription.getTopic().getTopicName();
            subscribedTopicDtoArrayList.add(new UserSubscribedTopicDto(topicId, topicName));
        }
        return subscribedTopicDtoArrayList;
    }
}
