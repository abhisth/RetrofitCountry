package com.example.retrofitcountry;

import com.google.gson.annotations.SerializedName;

public class Posts {


    private String region;

    @SerializedName("name")
    private Cname cname;

    @SerializedName("flags")
    private Flag flag;

    @SerializedName("capital")
    private String[] capital;



    public Posts(String region, Flag flag, Cname cname,String[] capital) {
        this.region = region;
        this.cname = cname;
        this.flag = flag;
        this.capital = capital;


    }


    public String[] getCapital() {
        return capital;
    }

    public Flag getFlag() {
        return flag;
    }


    public String getRegion() {
        return region;
    }

    public Cname getCname() {
        return cname;
    }
}
