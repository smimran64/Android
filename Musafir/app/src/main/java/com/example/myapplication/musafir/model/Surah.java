package com.example.myapplication.musafir.model;

import com.google.gson.annotations.SerializedName;

public class Surah {
    @SerializedName("number")

    private int number;

    @SerializedName("name")
    private String name;

    @SerializedName("englishName")
    private String englishName;

    @SerializedName("numberOfAyahs")
    private int numberOfAyahs;


    @SerializedName("revelationType")
    private String revelationType;


    public Surah() {
    }

    public Surah(int number, String name, String englishName, int numberOfAyahs, String revelationType) {
        this.number = number;
        this.name = name;
        this.englishName = englishName;
        this.numberOfAyahs = numberOfAyahs;
        this.revelationType = revelationType;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public int getNumberOfAyahs() {
        return numberOfAyahs;
    }

    public void setNumberOfAyahs(int numberOfAyahs) {
        this.numberOfAyahs = numberOfAyahs;
    }

    public String getRevelationType() {
        return revelationType;
    }

    public void setRevelationType(String revelationType) {
        this.revelationType = revelationType;
    }
}
