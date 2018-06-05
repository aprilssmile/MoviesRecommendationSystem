package com.company;

import com.google.gson.Gson;

public class MoviesDataProvider{
    public Movie FightClub(){
        TheMovieDbClient movieClient = new TheMovieDbClient();
        String films = movieClient.GetFilms();

        Movie targetObject = new Gson().fromJson(films, Movie.class);
        return targetObject;
    }
}
