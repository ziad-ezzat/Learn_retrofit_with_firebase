package com.example.retrofit_firebase;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiInterface {
    @POST("/upload/{new}.json")
    public Call<Photo> setData(@Body Photo photo);
}
