package org.training.infrastructure;

import java.lang.reflect.InvocationTargetException;

public interface Context {
    <T> T getBean(String name) throws IllegalAccessException, InstantiationException, InvocationTargetException;
}
