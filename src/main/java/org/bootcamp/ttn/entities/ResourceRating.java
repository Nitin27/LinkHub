package org.bootcamp.ttn.entities;

import org.bootcamp.ttn.enums.ResourceScore;

import javax.persistence.*;

@Entity
public class ResourceRating {
//    @EmbeddedId
//    private ResourceRating_Id resourceRatingId;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer resourceRatingId;
    @OneToOne
    //@MapsId("resource")
    private Resource resource;
    @OneToOne
    //@MapsId("user")
    private User user;
    private ResourceScore score;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ResourceScore getScore() {
        return score;
    }

    public void setScore(ResourceScore score) {
        this.score = score;
    }

    public Integer getResourceRatingId() {
        return resourceRatingId;
    }

    public void setResourceRatingId(Integer resourceRatingId) {
        this.resourceRatingId = resourceRatingId;
    }
}
