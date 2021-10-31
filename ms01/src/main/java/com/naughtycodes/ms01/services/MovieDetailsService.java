package com.naughtycodes.ms01.services;

import com.naughtycodes.ms01.models.MovieDetails;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class MovieDetailsService {

    public List<MovieDetails> loadMovieDetailsToList() {
        List<MovieDetails> mdList = new ArrayList<MovieDetails>();
        mdList.add(new MovieDetails(01,"petta","a karthick suburaj movie", 2019, 1));
        mdList.add(new MovieDetails(02,"kala","a pa ranjith movie", 2020, null));
        mdList.add(new MovieDetails(03,"sarpata parambarai","a pa ranjith movie", 2021, null));
        mdList.add(new MovieDetails(04,"vada chennai","a vetrimaran movie", 2019, null));
        return mdList;
    }
    public List<MovieDetails> getMovieDetails(Integer id){
        List<MovieDetails> l = this.loadMovieDetailsToList();
        return l.stream().filter(e -> e.getId() == id).collect(Collectors.toList());
    }

}
