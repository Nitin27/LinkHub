package org.bootcamp.ttn.services.impl;

import org.bootcamp.ttn.dao.IResourceDao;
import org.bootcamp.ttn.dao.impl.ResourceDaoImpl;
import org.bootcamp.ttn.dto.RecentSharesDto;
import org.bootcamp.ttn.entities.Resource;
import org.bootcamp.ttn.entities.Topic;
import org.bootcamp.ttn.entities.User;
import org.bootcamp.ttn.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Nitin Jain on 7/22/2017.
 */
@Service
public class ResourceServiceImpl implements IResourceService {
    @Autowired
    ILinkResourceService linkResourceService;
    @Autowired
    IDocumentResourceService documentResourceService;
    @Autowired
    ITopicService topicService;
    @Autowired
    IUserService userService;
    @Autowired
    IResourceDao resourceDao;

    @Override
    public Boolean addLink(String linkName, String linkDescription, Integer topicId, String userName) {
        Topic topic = topicService.getTopicDetails(topicId);
        User user = userService.getUserId(userName);
        Boolean check = linkResourceService.addLinkResource(topic, linkName, linkDescription, user);
        return true;
    }

    @Override
    public List<RecentSharesDto> getRecentShare() {
        List<Resource> resources= resourceDao.getRecentShare();
        List<RecentSharesDto> recentSharesDtoList=new ArrayList<RecentSharesDto>();
        Iterator i=resources.iterator();
        Resource resource;
        RecentSharesDto recentSharesDto;
        while(i.hasNext()){
            resource=(Resource) i.next();
            recentSharesDto=new RecentSharesDto();
            recentSharesDto.setUserId(resource.getUser().getUserId());
            recentSharesDto.setFirstName(resource.getUser().getFirstName());
            recentSharesDto.setLastName(resource.getUser().getLastName());
            recentSharesDto.setUserName(resource.getUser().getUserName());
            recentSharesDto.setTopicId(resource.getTopic().getTopicId());
            recentSharesDto.setTopicName(resource.getTopic().getTopicName());
            recentSharesDto.setLinkId(resource.getResourceId());
            recentSharesDto.setLinkDescription(resource.getDescription());
            recentSharesDtoList.add(recentSharesDto);
        }
        return recentSharesDtoList;
    }
}
