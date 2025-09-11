package com.example.myapplication.musafir.viewmodel;

import androidx.lifecycle.LiveData;

import com.example.myapplication.musafir.model.SurahResponse;
import com.example.myapplication.musafir.repository.SurahRepo;

public class SurahViewModel {

    private SurahRepo surahRepo;


    public SurahViewModel() {

        surahRepo = new SurahRepo();
    }

    public SurahViewModel(SurahRepo surahRepo) {
        this.surahRepo = surahRepo;
    }


    public LiveData<SurahResponse> getSurah(){

        return surahRepo.getSurah();
    }


}
