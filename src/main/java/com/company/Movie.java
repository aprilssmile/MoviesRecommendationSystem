package com.company;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Movie{
    public int id;
    public String title;

    @SerializedName("vote_average")
    public double voteAverage;

    public ArrayList<Genre> genres;
}

