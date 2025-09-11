package com.example.myapplication.musafir.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.myapplication.musafir.model.SurahResponse;
import com.example.myapplication.musafir.network.Api;
import com.example.myapplication.musafir.network.JsonPlaceHolderApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SurahRepo {

private JsonPlaceHolderApi jsonPlaceHolderApi;

public SurahRepo(){

    jsonPlaceHolderApi = Api.getRetrofit().create(JsonPlaceHolderApi.class);
}

public LiveData<SurahResponse>getSurah(){

    MutableLiveData<SurahResponse> data = new MutableLiveData<>();

    jsonPlaceHolderApi.getSurah().enqueue(new Callback<SurahResponse>() {
        @Override
        public void onResponse(Call<SurahResponse> call, Response<SurahResponse> response) {

        }

        @Override
        public void onFailure(Call<SurahResponse> call, Throwable t) {

        }
    });


    return data;
}
}
