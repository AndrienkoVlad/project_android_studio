package com.example.l_lpp_android_lb2;

public class Item {
    String name;
    String email;
    int image;

    public Item(String name, String email, int image) {
        this.name = name;
        this.email = email;
        this.image = image;
    }

    public Item(String john, String email) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
