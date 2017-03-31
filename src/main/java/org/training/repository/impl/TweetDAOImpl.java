package org.training.repository.impl;

import org.training.domain.Tweet;
import org.training.domain.User;

import java.util.ArrayList;
import java.util.List;

public class TweetDAOImpl implements org.training.repository.TweetDAO {
    private List<Tweet> tweets = new ArrayList<>();

    @PostConstructBean
    public void init(){
        tweets.add(new Tweet("content1",new User()));
        tweets.add(new Tweet("content2",new User()));
    }
    @Override
    public void save(Tweet tweet){
        tweets.add(tweet);
    }

    @Override
    public Iterable<Tweet> findAll(){
        return new ArrayList<>(tweets);
    }
}
