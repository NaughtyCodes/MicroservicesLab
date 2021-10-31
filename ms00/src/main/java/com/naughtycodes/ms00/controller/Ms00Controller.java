package com.naughtycodes.ms00.controller;

import com.naughtycodes.ms00.models.MovieDetails;
import com.naughtycodes.ms00.models.MovieRatings;
import com.naughtycodes.ms00.services.MovieCatalogService;
//import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ms")
public class Ms00Controller {

    @Autowired
    private MovieCatalogService movieCatalogService;

    @RequestMapping("/{id}")
    public List<MovieDetails> getCatalog(@PathVariable("id") Integer id) {
        return movieCatalogService.getCatalog(id);
    }

}
