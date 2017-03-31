package org.training.infrastructure;

import org.training.repository.impl.TweetDAOImpl;

import java.util.HashMap;
import java.util.Map;

public class JavaConfig implements Config {

    public final Map<String,Class<?>> classes = new HashMap<>();

    {
        classes.put("tweetDAO", TweetDAOImpl.class);
    }

    @Override
    public Class<?> getImpl(String name) {
        return classes.get(name);
    }
}
