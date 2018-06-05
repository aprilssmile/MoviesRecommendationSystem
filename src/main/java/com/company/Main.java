package com.company;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        MoviesDataProvider movieDataProvider = new MoviesDataProvider();
        Movie fightClub = movieDataProvider.FightClub();

        System.out.println(new Gson().toJson(fightClub));
    }
}

