package com.javahack.demo.models;

public enum Role {
    USER("USER"),
    ADMIN("ADMIN");

    private String name;

    public String getName() {
        return name;
    }

    Role(String name) {
        this.name = name;
    }
}
