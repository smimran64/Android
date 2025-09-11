package com.example.myapplication.musafir.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SurahResponse {

    @SerializedName("data")
    private List<Surah> surahList;

    public List<Surah> getSurahList() {
        return surahList;
    }

    public void setSurahList(List<Surah> surahList) {
        this.surahList = surahList;
    }
}
