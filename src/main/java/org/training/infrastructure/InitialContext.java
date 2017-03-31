package org.training.infrastructure;

public class InitialContext {
    private Config config;

    public InitialContext(Config config) {
        this.config = config;
    }

    public Object lookup(String name) throws IllegalAccessException, InstantiationException {
        return config.getImpl(name).newInstance();
    }
}
