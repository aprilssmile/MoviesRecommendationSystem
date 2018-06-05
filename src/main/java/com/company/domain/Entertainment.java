package com.company.domain;

/**
 * @author Anton Maximov
 * @since 22/05/18
 */
// сразу скажем, что делаем абстрактным, потому что неприменим сам по себе

// это архитектор придумал

// нужно реализовать сериал и фильм
public abstract class Entertainment {

    /* private */
    int rating;

    public int getRating() {
        return rating;
    }

    // в сеттерах никакой логики!
    public void setRating(int rating) {
        // это потом
//        if (rating < 0) {
//            System.out.println("Oh no, negative rating!!");
//            return;
//        }

        this.rating = rating;
    }

    public abstract void print();
}
