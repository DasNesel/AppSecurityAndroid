package com.example.secu_app.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class getJson {

    public static final String BASE_URL = "https://6007f1a4309f8b0017ee5022.mockapi.io/api/m1/";
    public static Retrofit retrofit;

    public static Retrofit getInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
    public GetEvents create(Class<GetEvents> retrofitInterfaceClass) { return null; }
}
