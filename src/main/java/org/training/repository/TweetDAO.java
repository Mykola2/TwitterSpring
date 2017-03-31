package org.training.repository;

import org.training.domain.Tweet;

public interface TweetDAO {
    void save(Tweet tweet);

    Iterable<Tweet> findAll();
}
