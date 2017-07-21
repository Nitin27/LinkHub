package org.bootcamp.ttn.services;

import org.bootcamp.ttn.entities.Topic;
import org.bootcamp.ttn.entities.User;

/**
 * Created by Nitin Jain on 7/22/2017.
 */
public interface ILinkResourceService {
    Boolean addLinkResource(Topic topic, String linkName, String linkDescription, User user);
}
