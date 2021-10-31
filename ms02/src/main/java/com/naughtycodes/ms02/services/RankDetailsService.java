package com.naughtycodes.ms02.services;

import com.naughtycodes.ms02.models.MovieRatings;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class RankDetailsService {

    public List<MovieRatings> loadMovieDetailsToList() {
        List<MovieRatings> mdList = new ArrayList<MovieRatings>();
        mdList.add(new MovieRatings(01,"petta",5));
        mdList.add(new MovieRatings(02,"kala",2));
        mdList.add(new MovieRatings(03,"sarpata parambarai",3));
        mdList.add(new MovieRatings(04,"vada chennai",4));
        return mdList;
    }
    public List<MovieRatings> getRankDetails(Integer id){
        List<MovieRatings> l = this.loadMovieDetailsToList();
        return l.stream().filter(e -> e.getId() == id).collect(Collectors.toList());
    }

}
