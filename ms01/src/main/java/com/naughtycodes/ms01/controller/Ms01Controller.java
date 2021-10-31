package com.naughtycodes.ms01.controller;

import com.naughtycodes.ms01.models.MovieDetails;
import com.naughtycodes.ms01.services.MovieDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(value = "/ms")
public class Ms01Controller {

    @Autowired
    private MovieDetailsService movieDetailsService;

    @GetMapping(value = "/{id}")
    public List<MovieDetails> getMovieDetails(@PathVariable Integer id) {
        return movieDetailsService.getMovieDetails(id);
    }

}
