package org.training.infrastructure;

import org.training.repository.impl.PostConstructBean;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

public class ApplicationContext implements Context {

    private final Config config;
    private HashMap<String, Object> beans = new HashMap<>();

    public ApplicationContext(Config config) {
        this.config = config;
    }

    @Override
    public <T> T getBean(String name) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> clazz = config.getImpl(name);
        if (clazz == null) {
            throw new RuntimeException("Bean not found");
        }

        T bean = (T) clazz.newInstance();
        callInitMethod(bean);
        if (beans.containsKey(name)) {
            return (T) beans.get(name);
        } else
            beans.put(name, bean);
        return bean;
    }

    private <T> void callInitMethod(T bean) throws InvocationTargetException, IllegalAccessException {
        for (Method method : bean.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(PostConstructBean.class))
                method.invoke(bean);
        }


    }
}
