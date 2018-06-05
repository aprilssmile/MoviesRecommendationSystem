package com.company;

import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) {
        TheMovieDbClient movieClient = new TheMovieDbClient();
        String films = null;
        try {
            films = movieClient.GetFilms();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        System.out.println(films);

    }
}

