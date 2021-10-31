package com.naughtycodes.ms00.services;

import com.naughtycodes.ms00.models.MovieDetails;
import com.naughtycodes.ms00.models.MovieDetailsList;
import com.naughtycodes.ms00.models.MovieRatings;
import com.naughtycodes.ms00.models.MovieRatingsList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieCatalogService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    WebClient.Builder webClientBuilder;

    public List<MovieDetails> getCatalog(Integer id) {
        MovieRatings[] movieRatingsList = restTemplate.getForObject("http://movie-ratings-service/ms/" + id, MovieRatings[].class);
        return Arrays.asList(movieRatingsList).stream()
                .map(rating -> {
                    MovieDetails[] movieDetailsList = restTemplate.getForObject("http://movie-details-service/ms/" + rating.getId(), MovieDetails[].class);
                    MovieDetails movie = Arrays.asList(movieDetailsList).get(0);
                    System.out.println(movie.toString());
                    return new MovieDetails(movie.getId(), movie.getName(), movie.getDescription(), movie.getYear(), rating.getRatings());
                })
                .collect(Collectors.toList());
    }

}
