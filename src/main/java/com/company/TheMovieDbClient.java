package com.company;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;

public class TheMovieDbClient{
    private final String apiKey = "e4b50ac6307a649af20028f665138ef5";
    private HttpClient _client;

    public TheMovieDbClient(){
        _client = HttpClientBuilder.create().build();
    }

    public String GetFilms() throws URISyntaxException {

        URI uri = new URIBuilder("http://api.themoviedb.org/3/movie/550")
                .addParameter("api_key", apiKey).build();

        HttpGet request = new HttpGet(uri);

        String responseString = null;
        try {
            HttpResponse response = _client.execute(request);

            HttpEntity entity = response.getEntity();
            responseString = EntityUtils.toString(entity, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return responseString;
    }
}

