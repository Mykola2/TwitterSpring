package org.training.domain;

public class Tweet {
    private String content;
    private User user;

    public Tweet() {
    }

    public Tweet(String content, User user) {
        this.content = content;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "content='" + content + '\'' +
                ", user=" + user +
                '}';
    }
}
