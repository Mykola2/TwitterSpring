package org.training.infrastructure;

public interface Config {
    public Class<?> getImpl(String name);
}
