package com.example.retrofitcountry;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static final String BASE_URL ="https://restcountries.com//";
    private static Retrofit retrofit = null;

    public static ApiInterface getRetrofitCLient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();


        }
        return retrofit.create(ApiInterface.class);
    }
}
