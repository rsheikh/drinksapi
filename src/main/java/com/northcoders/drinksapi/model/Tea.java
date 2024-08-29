package com.northcoders.drinksapi.model;

import java.util.concurrent.atomic.AtomicLong;

public class Tea {
    long id;
    String name;
    String type;
    static AtomicLong counter = new AtomicLong(0);

    public Tea(String name, String type) {
        this.id = counter.incrementAndGet();
        this.name = name;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

}
