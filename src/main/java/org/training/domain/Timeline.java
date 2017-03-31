package org.training.domain;

import java.util.ArrayList;
import java.util.List;

public class Timeline {
    private final List<Tweet> tweets = new ArrayList<>();

    public void addTweet(Tweet tweet){
        tweets.add(tweet);
    }

    public Iterable<Tweet> getTweets() {
        return new ArrayList<>(tweets);
    }

}
