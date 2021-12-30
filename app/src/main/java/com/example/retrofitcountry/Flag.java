package com.example.retrofitcountry;

import com.google.gson.annotations.SerializedName;

import retrofit2.http.Url;

public class Flag {

    @SerializedName("png")
    private String cflag;

    public Flag(String cflag) {
        this.cflag = cflag;
    }


    public String getCflag() {
        return cflag;
    }
}
