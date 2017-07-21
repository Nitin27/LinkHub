package org.bootcamp.ttn.services;

/**
 * Created by Nitin Jain on 7/22/2017.
 */
public interface IResourceService {
    Boolean addLink(String linkName, String linkDescription, Integer topicId, String userName);
}
