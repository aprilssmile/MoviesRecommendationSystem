package com.company.procedural;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anton Maximov
 * @since 22/05/18
 */
public class ProceduralRatings {

    // да, в джаве есть тип строка и это КЛАСС
    static String[] movieNames = {"Govno", "Zhopa"};

    static String[] tvShowNames = {"IT Crowd", "Silicon Valley"};

    // вообще можно и поудачнее организовать сопоставление
    static double[] imdbRatings = { 5.2, 6.4 };

    static int[] showYears = { 2006, 2014 };

    /* или выпилить вот это?
        struct {
            String movieName;
            double imdbRating;
        }

        struct {
            String tvShowName;
            int year;
        }
    */

    // разные люди пишут разное - нужно взаимодействовать


    //
    static void printMovie(String movieName, double rating) {
        System.out.println("Movie " + movieName + " has " + rating);
    }

    static void printTvShow(String showName, int year) {
        System.out.println("Tv show " + showName + " began " + year);
    }

    public static void main(String[] args) {
        for (int i = 0; i < movieNames.length; i++) {
            printMovie(movieNames[i], imdbRatings[i]);

        }
    }
}
