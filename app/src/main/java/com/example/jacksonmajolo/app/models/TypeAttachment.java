package com.example.jacksonmajolo.app.models;

/**
 * Created by Jackson Majolo on 24/03/2017.
 */

public class TypeAttachment {
    private String name;
    private String image;

    public TypeAttachment() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
