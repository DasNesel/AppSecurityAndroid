package com.example.secu_app.API;

import com.example.secu_app.models.User;

import retrofit2.Call;
import retrofit2.http.GET;

public interface getUser {
    @GET("/config/1")
    Call<User> getUser(); // à checker
}