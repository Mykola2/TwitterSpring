package org.training;

import org.training.domain.Tweet;
import org.training.infrastructure.ApplicationContext;
import org.training.infrastructure.Context;
import org.training.infrastructure.InitialContext;
import org.training.infrastructure.JavaConfig;
import org.training.repository.TweetDAO;
import org.training.repository.impl.TweetDAOImpl;

import java.lang.reflect.InvocationTargetException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        Context context = new ApplicationContext(new JavaConfig());
        TweetDAO tweetDAO = context.getBean("tweetDAO");
        tweetDAO.findAll().forEach(System.out::println);
    }
}
