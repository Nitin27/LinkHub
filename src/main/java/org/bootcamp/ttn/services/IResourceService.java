package org.bootcamp.ttn.services;

import org.bootcamp.ttn.dto.RecentSharesDto;

import java.util.List;

/**
 * Created by Nitin Jain on 7/22/2017.
 */
public interface IResourceService {
    Boolean addLink(String linkName, String linkDescription, Integer topicId, String userName);
    List<RecentSharesDto> getRecentShare();

}
