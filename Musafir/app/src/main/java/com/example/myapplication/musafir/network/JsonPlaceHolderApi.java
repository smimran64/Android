package com.example.myapplication.musafir.network;

import com.example.myapplication.musafir.model.SurahResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("surah")
    Call<SurahResponse> getSurah();

}
