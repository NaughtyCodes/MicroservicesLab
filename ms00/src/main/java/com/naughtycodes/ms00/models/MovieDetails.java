package com.naughtycodes.ms00.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class MovieDetails {
    private Integer id;
    private String name;
    private String description;
    private Integer year;
    private Integer ratings;

}
