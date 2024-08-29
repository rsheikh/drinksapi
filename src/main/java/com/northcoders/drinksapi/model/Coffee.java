package com.northcoders.drinksapi.model;

import java.util.concurrent.atomic.AtomicLong;

public class Coffee {
    long id;
    String name;
    static AtomicLong counter = new AtomicLong(0);

    public Coffee(String name) {
        this.id = counter.incrementAndGet();
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
