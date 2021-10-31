package com.naughtycodes.ms01.models;

import lombok.Data;

@Data
public class MovieDetails {
    private final Integer id;
    private final String name;
    private final String description;
    private final Integer year;
    private final Integer ratings;

}
