package org.bootcamp.ttn.dao;

import org.bootcamp.ttn.entities.Topic;
import org.bootcamp.ttn.entities.User;

/**
 * Created by Nitin Jain on 7/22/2017.
 */
public interface ILinkResourceDao {
    Boolean addLink(Topic topic, String linkName, String linkDescription, User user);
}
