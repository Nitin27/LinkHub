package org.bootcamp.ttn.dto;

/**
 * Created by Nitin Jain on 7/21/2017.
 */
public class UserSubscribedTopicDto {
    private Integer TopicId;
    private String TopicName;

    public UserSubscribedTopicDto(Integer topicId, String topicName) {
        TopicId = topicId;
        TopicName = topicName;
    }

    public UserSubscribedTopicDto() {
    }

    public Integer getTopicId() {
        return TopicId;
    }

    public void setTopicId(Integer topicId) {
        TopicId = topicId;
    }

    public String getTopicName() {
        return TopicName;
    }

    public void setTopicName(String topicName) {
        TopicName = topicName;
    }
}
