package com.example.retrofitcountry;

import com.google.gson.annotations.SerializedName;


public class Cname {

    @SerializedName("common")
    private String name;

    public Cname(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
