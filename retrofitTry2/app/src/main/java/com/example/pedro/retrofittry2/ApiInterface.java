package com.example.pedro.retrofittry2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {


    @POST("rest/login")
    Call<LoginResponse> getLogin(@Body LoginRequest loginRequest);
}
