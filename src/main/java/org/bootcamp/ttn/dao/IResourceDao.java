package org.bootcamp.ttn.dao;

import org.bootcamp.ttn.entities.Resource;
import org.bootcamp.ttn.entities.Subscription;

import java.util.List;

/**
 * Created by Nitin Jain on 7/22/2017.
 */

public interface IResourceDao {
    List<Resource> getRecentShare();
}
