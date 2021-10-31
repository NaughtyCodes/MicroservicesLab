package com.naughtycodes.ms02.controller;

import com.naughtycodes.ms02.models.MovieRatings;
import com.naughtycodes.ms02.services.RankDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ms")
public class Ms02Controller {

    @Autowired
    private RankDetailsService rankDetailsService;

    @GetMapping(value = "/{id}")
    public List<MovieRatings> getMovieDetails(@PathVariable Integer id) {
        return rankDetailsService.getRankDetails(id);
    }

}
