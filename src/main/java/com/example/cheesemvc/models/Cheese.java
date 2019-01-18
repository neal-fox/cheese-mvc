package com.example.cheesemvc.models;

public class Cheese {
    //fields
    private String name;
    private String description;

    //contructors
    public Cheese(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public Cheese(String name) {
        this(name, "");
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
