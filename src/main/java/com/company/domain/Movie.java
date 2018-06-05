package com.company.domain;

import java.util.Optional;

/**
 * @author Anton Maximov
 * @since 22/05/18
 */
public class Movie /*extends Entertainment*/ {

    String name;
    int rating;

    // заодно и про override сказать
//    @Override
    public void print() {
        System.out.println(name + " has rating " + rating);

//        "ff" == "ff"// true
//        "ff" != new String("ff")
//        new String("ff").intern() == "ff"

//        new Integer(1) == new Integer(1);
//        new Integer(100500) != new Integer(100500);


    }
}
