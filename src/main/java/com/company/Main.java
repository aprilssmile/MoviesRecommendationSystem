package com.company;

import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) {
        TheMovieDbClient movieClient = new TheMovieDbClient();
        String films = movieClient.GetFilms();


        System.out.println(films);

    }
}

