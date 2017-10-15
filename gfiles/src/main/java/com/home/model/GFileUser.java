package com.home.model;

/**
 * Created by gateman on 17-10-15.
 */
public class GFileUser {
    private int id;
    private String name;

    public GFileUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
