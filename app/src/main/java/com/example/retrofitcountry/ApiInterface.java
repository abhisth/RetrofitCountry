package com.example.retrofitcountry;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("v3.1/region/asia")
    Call<List<Posts>> getPosts();

}
