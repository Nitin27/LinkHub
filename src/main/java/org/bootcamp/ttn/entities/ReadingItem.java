package org.bootcamp.ttn.entities;

import javax.persistence.*;

@Entity
public class ReadingItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String readingItemId;
//    @EmbeddedId
//    private ReadingItem_Id readingItem_id;
    @OneToOne
    //@MapsId("resource")
    private Resource resource;
    @OneToOne
    //@MapsId("user")
    private User user;
    private Boolean isRead;

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

    public Boolean getRead() {
        return isRead;
    }

    public void setRead(Boolean read) {
        isRead = read;
    }

    public String getReadingItemId() {
        return readingItemId;
    }

    public void setReadingItemId(String readingItemId) {
        this.readingItemId = readingItemId;
    }
}
